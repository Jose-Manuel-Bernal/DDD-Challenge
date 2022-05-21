package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.*;

public class AddAppointment extends Command {
    private final TattooSessionID tattooSessionID;
    private final AppointmentID appointmentId;
    private final Date date;
    private final Hour hour;

    public AddAppointment(TattooSessionID tattooSessionID, AppointmentID appointmentId, Date date, Hour hour) {
        this.tattooSessionID = tattooSessionID;
        this.appointmentId = appointmentId;
        this.date = date;
        this.hour = hour;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public AppointmentID getAppointmentId() {
        return appointmentId;
    }

    public Date getDate() {
        return date;
    }

    public Hour getHour() {
        return hour;
    }
}
