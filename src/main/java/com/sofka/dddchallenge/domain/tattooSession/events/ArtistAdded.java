package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.ArtistID;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.Specialization;

public class ArtistAdded extends DomainEvent {
    private final ArtistID artistID;
    private final Name name;
    private final Specialization specialization;

    public ArtistAdded(ArtistID artistId, Name name, Specialization specialization){
        super("sofka.tattoosession.artistadded");
        this.artistID = artistId;
        this.name = name;
        this.specialization = specialization;
    }

    public ArtistID getArtistID() {
        return artistID;
    }

    public Name getName() {
        return name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
}
