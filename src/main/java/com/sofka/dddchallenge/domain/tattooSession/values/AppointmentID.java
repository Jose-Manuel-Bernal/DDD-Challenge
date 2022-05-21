package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.Identity;

public class AppointmentID extends Identity {

    public AppointmentID(){}

    private AppointmentID(String id){
        super(id);
    }

    public AppointmentID of(String id){
        return new AppointmentID(id);
    }
}
