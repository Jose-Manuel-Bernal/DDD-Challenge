package com.sofka.dddchallenge.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.tattooSession.values.NumberOfSession;
import com.sofka.dddchallenge.tattooSession.values.ProjectName;

public class TattooSessionCreated extends DomainEvent {
    private final ProjectName projectName;
    private final NumberOfSession numberOfSession;

    public TattooSessionCreated(ProjectName projectName, NumberOfSession numberOfSession){
        super("sofka.tattoosession.tattoosessioncreated");
        this.projectName = projectName;
        this.numberOfSession = numberOfSession;
    }

    public ProjectName getProjectName() {
        return projectName;
    }

    public NumberOfSession getNumberOfSession() {
        return numberOfSession;
    }
}
