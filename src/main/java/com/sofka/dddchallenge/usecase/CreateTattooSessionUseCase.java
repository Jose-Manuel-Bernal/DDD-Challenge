package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.CreateTattooSession;

public class CreateTattooSessionUseCase extends UseCase<RequestCommand<CreateTattooSession>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<CreateTattooSession> createTattooSessionRequestCommand) {
        var command = createTattooSessionRequestCommand.getCommand();
        var session = new TattooSession(command.getTattooSessionID(), command.getProjectName(), command.getNumberOfSession());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
