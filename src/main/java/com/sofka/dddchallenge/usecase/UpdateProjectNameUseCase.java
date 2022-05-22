package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateProjectName;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateProjectNameUseCase extends UseCase<RequestCommand<UpdateProjectName>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateProjectName> updateProjectNameRequestCommand) {
        var command = updateProjectNameRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateProjectName(command.getProjectName());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }

}
