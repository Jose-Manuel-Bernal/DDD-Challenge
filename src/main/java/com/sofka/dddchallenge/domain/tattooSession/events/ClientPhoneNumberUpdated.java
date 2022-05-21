package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.PhoneNumber;

public class ClientPhoneNumberUpdated extends DomainEvent {
    private PhoneNumber phoneNumber;


    public ClientPhoneNumberUpdated(PhoneNumber phoneNumber) {
        super("sofka.tattoosession.clientphonenumberupdated");
        this.phoneNumber = phoneNumber;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
