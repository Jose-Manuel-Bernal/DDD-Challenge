package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateArtistSpecialization;

public class UpdateArtistSpecializationUseCase extends UseCase<RequestCommand<UpdateArtistSpecialization>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateArtistSpecialization> updateArtistSpecializationRequestCommand) {
        var command = updateArtistSpecializationRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateArtistSpecialization(command.getSpecialization());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
