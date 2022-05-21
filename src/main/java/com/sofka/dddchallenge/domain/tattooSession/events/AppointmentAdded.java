package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.AppointmentID;
import com.sofka.dddchallenge.domain.tattooSession.values.Date;
import com.sofka.dddchallenge.domain.tattooSession.values.Hour;

public class AppointmentAdded extends DomainEvent {

    private final AppointmentID appointmentID;
    private final Date date;
    private final Hour hour;

    public AppointmentAdded(AppointmentID appointmentId, Date date, Hour hour){
        super("sofka.tattoosession.appintmentadded");
        this.appointmentID = appointmentId;
        this.date = date;
        this.hour = hour;
    }

    public AppointmentID getAppointmentID() {
        return appointmentID;
    }

    public Date getDate() {
        return date;
    }

    public Hour getHour() {
        return hour;
    }
}
