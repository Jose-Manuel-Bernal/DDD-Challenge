package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.CreateTattooSession;
import com.sofka.dddchallenge.domain.tools.Tools;
import com.sofka.dddchallenge.domain.tools.commands.CreateTools;

public class CreateToolsUseCase extends UseCase<RequestCommand<CreateTools>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<CreateTools> createToolsRequestCommand) {
        var command = createToolsRequestCommand.getCommand();
        var tools = new Tools(command.getToolsID(), command.getStretcher(),  command.getTable());
        emit().onResponse(new ResponseEvents(tools.getUncommittedChanges()));
    }
}
