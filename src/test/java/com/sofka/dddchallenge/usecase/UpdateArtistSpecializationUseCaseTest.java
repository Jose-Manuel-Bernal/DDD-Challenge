package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateArtistSpecialization;
import com.sofka.dddchallenge.domain.tattooSession.events.ArtistAdded;
import com.sofka.dddchallenge.domain.tattooSession.events.ArtistSpecializationUpdated;
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
public class UpdateArtistSpecializationUseCaseTest {
    @InjectMocks
    private UpdateArtistSpecializationUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void UpdateArtistSpecializationTest() {
        var command = new UpdateArtistSpecialization(TattooSessionID.of("xxxx"), new Specialization("Realism"));
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

        var event = (ArtistSpecializationUpdated) events.get(0);
        Assertions.assertEquals(command.getSpecialization().value(), event.getSpecialization().value());
        Mockito.verify(repository).getEventsBy("xxxx");
    }
}
