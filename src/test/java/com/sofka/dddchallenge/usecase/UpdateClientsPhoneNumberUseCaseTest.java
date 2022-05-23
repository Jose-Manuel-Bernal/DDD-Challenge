package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateClientName;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateClientsPhoneNumber;
import com.sofka.dddchallenge.domain.tattooSession.events.ClientAdded;
import com.sofka.dddchallenge.domain.tattooSession.events.ClientNameUpdated;
import com.sofka.dddchallenge.domain.tattooSession.events.ClientPhoneNumberUpdated;
import com.sofka.dddchallenge.domain.tattooSession.events.TattooSessionCreated;
import com.sofka.dddchallenge.domain.tattooSession.values.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UpdateClientsPhoneNumberUseCaseTest {
    @InjectMocks
    private UpdateClientsPhoneNumberUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void UpdateClientPhoneNumberTest() {
        var command = new UpdateClientsPhoneNumber(TattooSessionID.of("xxxx"), new PhoneNumber("9874563210"));
        when(repository.getEventsBy("xxxx")).thenReturn(List.of(
                new TattooSessionCreated(
                        new Name("sleeve"),
                        new NumberOfSession(1)
                ),
                new ClientAdded(ClientID.of("client1"), new Name("Juan"), new PhoneNumber("0123456789"))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Bad argument!"))
                .getDomainEvents();

        var event = (ClientPhoneNumberUpdated) events.get(0);
        Assertions.assertEquals(command.getPhoneNumber().value(), event.getPhoneNumber().value());
        Mockito.verify(repository).getEventsBy("xxxx");
    }
}
