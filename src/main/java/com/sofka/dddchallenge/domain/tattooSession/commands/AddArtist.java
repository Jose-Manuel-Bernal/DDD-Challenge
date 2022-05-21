package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.ArtistID;
import com.sofka.dddchallenge.domain.tattooSession.values.Name;
import com.sofka.dddchallenge.domain.tattooSession.values.Specialization;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class AddArtist extends Command {

    private final TattooSessionID tattooSessionID;
    private final ArtistID artistId;
    private final Name name;
    private final Specialization specialization;

    public AddArtist(TattooSessionID tattooSessionID, ArtistID artistId, Name name, Specialization specialization) {
        this.tattooSessionID = tattooSessionID;
        this.artistId = artistId;
        this.name = name;
        this.specialization = specialization;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public ArtistID getArtistId() {
        return artistId;
    }

    public Name getName() {
        return name;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

}
