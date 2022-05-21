package com.sofka.dddchallenge.domain.tattooSession;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.domain.tattooSession.values.AppointmentID;
import com.sofka.dddchallenge.domain.tattooSession.values.Date;
import com.sofka.dddchallenge.domain.tattooSession.values.Hour;

import java.util.Objects;


public class Appointment extends Entity<AppointmentID> {

    private Date date;
    private Hour hour;


    public Appointment(AppointmentID entityId, Date date, Hour hour) {
        super(entityId);
        this.date = date;
        this.hour = hour;
    }

    public void updateDate(Date date){
        this.date = Objects.requireNonNull(date);
    }

    public void UpdateHour(Hour hour){
        this.hour = Objects.requireNonNull(hour);
    }
}
