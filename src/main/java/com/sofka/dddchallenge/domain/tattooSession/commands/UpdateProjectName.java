package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateProjectName extends Command {
    private final Name projectName;
    private final TattooSessionID tattooSessionID;

    public UpdateProjectName(Name projectName, TattooSessionID tattooSessionID) {
        this.projectName = projectName;
        this.tattooSessionID = tattooSessionID;
    }

    public Name getProjectName() {
        return projectName;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }
}
