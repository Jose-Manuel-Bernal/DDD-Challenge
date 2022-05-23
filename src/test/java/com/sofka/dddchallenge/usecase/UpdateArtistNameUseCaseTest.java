package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateArtistName;
import com.sofka.dddchallenge.domain.tattooSession.events.ArtistAdded;
import com.sofka.dddchallenge.domain.tattooSession.events.ArtistNameUpdated;
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
public class UpdateArtistNameUseCaseTest {
    @InjectMocks
    private UpdateArtistNameUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void UpdateArtistNameTest() {
        var command = new UpdateArtistName(TattooSessionID.of("xxxx"), new Name("Esteban"));
        when(repository.getEventsBy("xxxx")).thenReturn(List.of(
                new TattooSessionCreated(
                        new Name("sleeve"),
                        new NumberOfSession(1)
                ),
                new ArtistAdded(ArtistID.of("art1"), new Name("Daniel"), new Specialization("BlackWork"))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Bad argument!"))
                .getDomainEvents();

        var event = (ArtistNameUpdated) events.get(0);
        Assertions.assertEquals(command.getName().value(), event.getName().value());
        Mockito.verify(repository).getEventsBy("xxxx");
    }
}
