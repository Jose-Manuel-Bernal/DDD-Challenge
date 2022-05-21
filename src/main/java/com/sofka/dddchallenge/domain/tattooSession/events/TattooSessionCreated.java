package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;

public class TattooSessionCreated extends DomainEvent {
    private final Name projectName;
    private final NumberOfSession numberOfSession;

    public TattooSessionCreated(Name projectName, NumberOfSession numberOfSession){
        super("sofka.tattoosession.tattoosessioncreated");
        this.projectName = projectName;
        this.numberOfSession = numberOfSession;
    }

    public Name getProjectName() {
        return projectName;
    }

    public NumberOfSession getNumberOfSession() {
        return numberOfSession;
    }
}
