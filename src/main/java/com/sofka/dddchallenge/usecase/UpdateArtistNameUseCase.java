package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateArtistName;

public class UpdateArtistNameUseCase extends UseCase<RequestCommand<UpdateArtistName>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateArtistName> updateArtistNameRequestCommand) {
        var command = updateArtistNameRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateArtistName(command.getName());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
