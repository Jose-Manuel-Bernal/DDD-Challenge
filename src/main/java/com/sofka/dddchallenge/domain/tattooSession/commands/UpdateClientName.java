package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateClientName extends Command {
    private final TattooSessionID tattooSessionID;
    private final Name name;

    public UpdateClientName(TattooSessionID tattooSessionID, Name name) {
        this.tattooSessionID = tattooSessionID;
        this.name = name;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public Name getName() {
        return name;
    }
}
