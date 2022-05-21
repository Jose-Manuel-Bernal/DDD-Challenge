package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;

public class ArtistNameUpdated extends DomainEvent {
    private final Name name;

    public ArtistNameUpdated(Name name) {
        super("sofka.tattosessioncreated.artistnameupdated");
        this.name = name;
    }

    public Name getName() {
        return name;
    }
}
