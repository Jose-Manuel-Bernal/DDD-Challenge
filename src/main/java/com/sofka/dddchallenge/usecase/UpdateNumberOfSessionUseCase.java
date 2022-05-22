package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateNumberOfSession;

public class UpdateNumberOfSessionUseCase extends UseCase<RequestCommand<UpdateNumberOfSession>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateNumberOfSession> updateNumberOfSessionRequestCommand) {
        var command = updateNumberOfSessionRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateNumberOfSession(command.getNumberOfSession());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
