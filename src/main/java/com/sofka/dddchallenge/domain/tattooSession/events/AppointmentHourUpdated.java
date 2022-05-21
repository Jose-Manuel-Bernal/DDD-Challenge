package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Hour;

public class AppointmentHourUpdated extends DomainEvent {
    private final Hour hour;

    public AppointmentHourUpdated(Hour hour) {
        super("sofka.tattosession.appointmenthourupdated");
        this.hour = hour;
    }

    public Hour getHour() {
        return hour;
    }
}
