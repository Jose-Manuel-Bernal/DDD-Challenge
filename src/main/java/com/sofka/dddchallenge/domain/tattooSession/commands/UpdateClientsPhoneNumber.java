package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.PhoneNumber;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateClientsPhoneNumber extends Command {
    private final TattooSessionID tattooSessionID;
    private final PhoneNumber phoneNumber;

    public UpdateClientsPhoneNumber(TattooSessionID tattooSessionID, PhoneNumber phoneNumber) {
        this.tattooSessionID = tattooSessionID;
        this.phoneNumber = phoneNumber;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public PhoneNumber getPhoneNumber() {
        return phoneNumber;
    }
}
