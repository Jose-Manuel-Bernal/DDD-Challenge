package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.RequestCommand;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateAppointmentHour;
import com.sofka.dddchallenge.domain.tattooSession.events.AppointmentAdded;
import com.sofka.dddchallenge.domain.tattooSession.events.AppointmentHourUpdated;
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
public class UpdateAppointmentHourUseCaseTest {
    @InjectMocks
    private UpdateAppointmentHourUseCase useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void UpdateAppointmentHourTest() {
        var command = new UpdateAppointmentHour(TattooSessionID.of("xxxx"), new Hour(11, 50, 0));
        when(repository.getEventsBy("xxxx")).thenReturn(List.of(
                new TattooSessionCreated(
                        new Name("sleeve"),
                        new NumberOfSession(1)
                ),
                new AppointmentAdded(AppointmentID.of("ap1"), new Date(2022,4,5), new Hour(8,30,0))
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new RequestCommand<>(command))
                .orElseThrow(() -> new IllegalArgumentException("Bad argument!"))
                .getDomainEvents();

        var event = (AppointmentHourUpdated) events.get(0);
        Assertions.assertEquals(command.getHour().value(), event.getHour().value());
        Mockito.verify(repository).getEventsBy("xxxx");
    }
}
