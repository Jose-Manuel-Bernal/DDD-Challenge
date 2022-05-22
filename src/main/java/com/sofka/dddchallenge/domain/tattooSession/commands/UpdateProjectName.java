package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateProjectName extends Command {
    private final Name projectName;
    private final TattooSessionID tattooSessionID;
    private final NumberOfSession numberOfSession;

    public UpdateProjectName(TattooSessionID tattooSessionID, Name projectName, NumberOfSession numberOfSession) {
        this.projectName = projectName;
        this.tattooSessionID = tattooSessionID;
        this.numberOfSession = numberOfSession;
    }

    public Name getProjectName() {
        return projectName;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public NumberOfSession getNumberOfSession() {
        return numberOfSession;
    }
}
