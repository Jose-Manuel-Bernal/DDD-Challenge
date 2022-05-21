package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.Specialization;

public class ArtistSpecializationUpdated extends DomainEvent {
    private final Specialization specialization;

    public ArtistSpecializationUpdated(Specialization specialization) {
        super("sofka.tattosession.artistspecializationupdated");
        this.specialization = specialization;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
}
