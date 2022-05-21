package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateNumberOfSession extends Command {
    private final TattooSessionID tattooSessionID;
    private final NumberOfSession numberOfSession;

    public UpdateNumberOfSession(TattooSessionID tattooSessionID, NumberOfSession numberOfSession) {
        this.tattooSessionID = tattooSessionID;
        this.numberOfSession = numberOfSession;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public NumberOfSession getNumberOfSession() {
        return numberOfSession;
    }
}
