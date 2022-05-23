package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCaseHandler;
import co.com.sofka.business.repository.DomainEventRepository;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.dddchallenge.domain.tools.events.StretcherUpdated;
import com.sofka.dddchallenge.domain.tools.events.ToolsCreated;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;
import com.sofka.dddchallenge.domain.tools.values.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
public class UpdateStretcherUseCaseByEventTest {
    @InjectMocks
    private UpdateStretcherUseCaseByEvent useCase;

    @Mock
    private DomainEventRepository repository;

    @Test
    void UpdateStretcherByEvent() {
        var event = new ToolsCreated(new Table(false), new Stretcher(false));
        event.setAggregateRootId("xxxx");
        Mockito.when(repository.getEventsBy("xxxx")).thenReturn(List.of(
                event
        ));
        useCase.addRepository(repository);

        var events = UseCaseHandler
                .getInstance()
                .setIdentifyExecutor("xxxx")
                .syncExecutor(useCase, new TriggeredEvent<>(event))
                .orElseThrow(() -> new IllegalArgumentException("Bad argument!"))
                .getDomainEvents();

        var eventR = (StretcherUpdated) events.get(0);
        Assertions.assertEquals(true, eventR.getStretcher().value());
        Mockito.verify(repository).getEventsBy("xxxx");
    }
}
