package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.ClientID;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.PhoneNumber;

public class ClientAdded extends DomainEvent {

    private final ClientID clientID;
    private final Name name;
    private final PhoneNumber phoneNumber;

    public ClientAdded(ClientID clientID, Name name, PhoneNumber phoneNumber) {
        super("sofka.tattoosession.clientadded");
        this.clientID= clientID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public ClientID getClientID() {
        return clientID;
    }

    public Name getName() {
        return name;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
