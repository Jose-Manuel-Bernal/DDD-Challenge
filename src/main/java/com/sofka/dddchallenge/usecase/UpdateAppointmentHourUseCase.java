package com.sofka.dddchallenge.usecase;

import co.com.sofka.business.generic.UseCase;
import co.com.sofka.business.support.RequestCommand;
import co.com.sofka.business.support.ResponseEvents;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.commands.UpdateAppointmentHour;

public class UpdateAppointmentHourUseCase extends UseCase<RequestCommand<UpdateAppointmentHour>, ResponseEvents> {

    @Override
    public void executeUseCase(RequestCommand<UpdateAppointmentHour> updateAppointmentHourRequestCommand) {
        var command = updateAppointmentHourRequestCommand.getCommand();
        var session = TattooSession.from(command.getTattooSessionID(), this.retrieveEvents());
        session.updateAppointmentHour(command.getHour());
        emit().onResponse(new ResponseEvents(session.getUncommittedChanges()));

    }
}
