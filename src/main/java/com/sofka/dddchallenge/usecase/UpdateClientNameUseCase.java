package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateClientName;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateNumberOfSession;

public class UpdateClientNameUseCase extends UseCase<RequestCommand<UpdateClientName>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateClientName> updateClientNameRequestCommand) {
        var command = updateClientNameRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateClientName(command.getName());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
