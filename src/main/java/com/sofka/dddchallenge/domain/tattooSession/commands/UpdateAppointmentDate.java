package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Date;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateAppointmentDate extends Command {
    private final TattooSessionID tattooSessionID;
    private final Date date;

    public UpdateAppointmentDate(TattooSessionID tattooSessionID, Date date) {
        this.tattooSessionID = tattooSessionID;
        this.date = date;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public Date getDate() {
        return date;
    }
}
