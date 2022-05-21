package com.sofka.dddchallenge.domain.tattooSession;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.domain.tattooSession.values.ClientID;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.PhoneNumber;

import java.util.Objects;

public class Client extends Entity<ClientID> {

    private Name name;
    private PhoneNumber phoneNumber;

    public Client(ClientID clientId, Name name, PhoneNumber phoneNumber) {
        super(clientId);
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updatePhoneNumber(PhoneNumber phoneNumber){
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
    }

    public Name name() {
        return name;
    }

    public PhoneNumber phoneNumber() {
        return phoneNumber;
    }
}
