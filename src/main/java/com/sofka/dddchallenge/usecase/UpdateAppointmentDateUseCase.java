package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateAppointmentDate;

public class UpdateAppointmentDateUseCase extends UseCase<RequestCommand<UpdateAppointmentDate>, ResponseEvents> {
    @Override
    public void executeUseCase(RequestCommand<UpdateAppointmentDate> updateAppointmentDateRequestCommand) {
        var command = updateAppointmentDateRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateAppointmentDate(command.getDate());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));
    }
}
