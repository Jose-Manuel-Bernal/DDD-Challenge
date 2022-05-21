package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Date;

public class AppointmentDateUpdated extends DomainEvent {
    private final Date date;

    public AppointmentDateUpdated(Date date) {
        super("sofka.tattosession.appointmentdateupdated");
        this.date = date;
    }

    public Date getDate() {
        return date;
    }
}
