package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;

public class ClientNameUpdated extends DomainEvent {
    private final Name name;


    public ClientNameUpdated(Name name) {
        super("sofka.tattoosession.clientnameupdated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
