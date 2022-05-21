package com.sofka.dddchallenge.domain.tattooSession;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.domain.tattooSession.values.ArtistID;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.Specialization;

import java.util.Objects;


public class Artist extends Entity<ArtistID> {

    private Name name;
    private Specialization specialization;

    public Artist(ArtistID entityId, Name name, Specialization specialization) {
        super(entityId);
        this.name = name;
        this.specialization = specialization;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateSpecialization(Specialization specialization){
        this.specialization = Objects.requireNonNull(specialization);
    }

    public Name name() {
        return name;
    }

    public Specialization specialization() {
        return specialization;
    }
}
