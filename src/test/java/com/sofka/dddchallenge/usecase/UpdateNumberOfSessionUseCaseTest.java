package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateNumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.events.NumberOfSessionUpdated;
import com.sofka.dddchallenge.domain.tattooSession.events.TattooSessionCreated;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;
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
public class UpdateNumberOfSessionUseCaseTest {
    @InjectMocks
    private UpdateNumberOfSessionUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void UpdateProjectNameTest (){
        var command = new UpdateNumberOfSession(TattooSessionID.of("xxxx"), new NumberOfSession(1));
        when(repository.getEventsBy("xxxx")).thenReturn(List.of(
                new TattooSessionCreated(
                        new Name("sleeve"),
                        new NumberOfSession(2)
                )
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Bad argument!"))
                .getDomainEvents();

        var event = (NumberOfSessionUpdated) events.get(0);
        Assertions.assertEquals(command.getNumberOfSession().value(), event.getNumberOfSession().value());
        Mockito.verify(repository).getEventsBy("xxxx");

    }
}
