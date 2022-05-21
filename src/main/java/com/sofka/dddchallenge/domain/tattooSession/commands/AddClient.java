package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.ClientID;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.PhoneNumber;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class AddClient extends Command {
    private final TattooSessionID tattooSessionID;
    private final ClientID clientID;
    private final Name name;
    private final PhoneNumber phoneNumber;

    public AddClient(TattooSessionID tattooSessionID, ClientID clientID, Name name, PhoneNumber phoneNumber) {
        this.tattooSessionID = tattooSessionID;
        this.clientID = clientID;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
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
