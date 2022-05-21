package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class CreateTattooSession extends Command {
    private final TattooSessionID tattooSessionID;
    private final Name projectName;
    private final NumberOfSession numberOfSession;

    public CreateTattooSession(TattooSessionID tattooSessionID, Name projectName, NumberOfSession numberOfSession) {
        this.tattooSessionID = tattooSessionID;
        this.projectName = projectName;
        this.numberOfSession = numberOfSession;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public Name getProjectName() {
        return projectName;
    }

    public NumberOfSession getNumberOfSession() {
        return numberOfSession;
    }
}
