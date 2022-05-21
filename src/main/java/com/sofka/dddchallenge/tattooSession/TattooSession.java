package com.sofka.dddchallenge.tattooSession;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.dddchallenge.tattooSession.events.ArtistAdded;
import com.sofka.dddchallenge.tattooSession.events.ProjectNameUpdated;
import com.sofka.dddchallenge.tattooSession.events.TattooSessionCreated;
import com.sofka.dddchallenge.tattooSession.values.*;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class TattooSession extends AggregateEvent<TattooSessionID> {
    protected ProjectName projectName;
    protected NumberOfSession numberOfSession;
    protected Set<Artist> artist;
    protected Set<Client> client;
    protected Set<Appointment> appointment;

    public TattooSession(TattooSessionID entityId, ProjectName projectName, NumberOfSession numberOfSession) {
        super(entityId);
        appendChange(new TattooSessionCreated(projectName, numberOfSession)).apply();
    }

    public void updateProjectName(ProjectName projectName){
        appendChange(new ProjectNameUpdated(projectName)).apply();
    }

    public void updateNumberOfSession(NumberOfSession numberOfSession){
        appendChange(new NumberOfSessionUpdated(numberOfSession)).apply();
    }

    public void addArtist(ArtistID artistId, Name name, Specialization specialization){
        Objects.requireNonNull(artistId);
        Objects.requireNonNull(name);
        Objects.requireNonNull(specialization);
        appendChange(new ArtistAdded(artistId, name, specialization)).apply();
    }

    public void addClient(ClientID clientID, Name name, PhoneNumber phoneNumber){
        Objects.requireNonNull(clientID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(phoneNumber);
        appendChange(new ClientAdded(clientID, name, phoneNumber)).apply();
    }

    public void updateArtistName(ArtistID entityId, Name name){
        appendChange(new ArtistNameUpdated(Name name)).apply();
    }

    public void updateArtistSpecialization(ArtistID entityId, Specialization specialization){
        appendChange(new ArtistSpecializationUpdated(specialization)).apply();
    }

    public void updateClientName(ArtistID entityId, Name name){
        appendChange(new ClientNameUpdated(name)).apply();
    }

    public void updateClientsPhoneNumber(ArtistID entityId, PhoneNumber phoneNumber){
        appendChange(new ClientPhoneNumberUpdated(phoneNumber)).apply();
    }

    public Optional<Artist> getArtistById(ArtistID artistID){
        return artists()
                .stream()
                .filter(artist -> artist.identity().equals(artistID))
                .findFirst();
    }

    public ProjectName projectName() {
        return projectName;
    }

    public NumberOfSession numberOfSession() {
        return numberOfSession;
    }

    public Set<Artist> artists() {
        return artist;
    }

    public Set<Client> clients() {
        return client;
    }
}
