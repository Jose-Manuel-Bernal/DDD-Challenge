package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.ResponseEvents;
import co.com.sofka.business.support.TriggeredEvent;
import com.sofka.dddchallenge.domain.tools.Tools;
import com.sofka.dddchallenge.domain.tools.events.ToolsCreated;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;
import com.sofka.dddchallenge.domain.tools.values.Table;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateTableUseCaseByEvent extends UseCase<TriggeredEvent<ToolsCreated>, ResponseEvents> {

    @Override
    public void executeUseCase(TriggeredEvent<ToolsCreated> toolsCreatedTriggeredEvent) {
        var event = toolsCreatedTriggeredEvent.getDomainEvent();
        var tools = Tools.from(ToolsID.of(event.aggregateRootId()),repository().getEventsBy(event.aggregateRootId()));
        tools.updateTable(new Table(true));
        emit().onResponse(new ResponseEvents(tools.getUncommittedChanges()));
    }
}
