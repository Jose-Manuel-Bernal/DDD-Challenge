package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Name;

public class DesingNameUpdated extends DomainEvent {
    private final Name name;

    public DesingNameUpdated(Name name){
        super("sofka.tools.desingnameupdated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
