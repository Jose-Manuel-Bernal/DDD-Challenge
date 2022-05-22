package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateClientsPhoneNumber;

public class UpdateClientsPhoneNumberUseCase extends UseCase<RequestCommand<UpdateClientsPhoneNumber>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateClientsPhoneNumber> updateClientsPhoneNumberRequestCommand) {
        var command = updateClientsPhoneNumberRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateClientsPhoneNumber(command.getPhoneNumber());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
