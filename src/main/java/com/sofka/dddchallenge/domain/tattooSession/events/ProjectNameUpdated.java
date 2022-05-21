package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;

public class ProjectNameUpdated extends DomainEvent {
    private final Name name;

    public ProjectNameUpdated(Name name) {
        super("sofka.tattoosession.projectnameupdated");
        this.name = name;
    }

    public Name getProjectName(){
        return name;
    }
}
