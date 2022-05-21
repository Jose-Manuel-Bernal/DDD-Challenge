package com.sofka.dddchallenge.tattooSession;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.tattooSession.values.ClientID;
import com.sofka.dddchallenge.tattooSession.values.Name;
import com.sofka.dddchallenge.tattooSession.values.PhoneNumber;

import java.util.Objects;

public class Client extends Entity<ClientID> {

    private Name name;
    private PhoneNumber phoneNumber;

    public Client(ClientID entityId, Name name, PhoneNumber phoneNumber) {
        super(entityId);
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
