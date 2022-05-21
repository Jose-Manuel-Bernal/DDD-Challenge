package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Specialization;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateArtistSpecialization extends Command {
    private final TattooSessionID tattooSessionID;
    private final Specialization specialization;

    public UpdateArtistSpecialization(TattooSessionID tattooSessionID, Specialization specialization) {
        this.tattooSessionID = tattooSessionID;
        this.specialization = specialization;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public Specialization getSpecialization() {
        return specialization;
    }
}
