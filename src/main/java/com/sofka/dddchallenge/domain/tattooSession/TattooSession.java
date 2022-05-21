package com.sofka.dddchallenge.domain.tattooSession;

import co.com.sofka.domain.generic.AggregateEvent;
import com.sofka.dddchallenge.domain.tattooSession.events.*;
import com.sofka.dddchallenge.domain.tattooSession.values.*;

import java.util.Objects;

public class TattooSession extends AggregateEvent<TattooSessionID> {
    protected Name projectName;
    protected NumberOfSession numberOfSession;
    protected Artist artist;
    protected Client client;
    protected Appointment appointment;

    public TattooSession(TattooSessionID entityId, Name projectName, NumberOfSession numberOfSession) {
        super(entityId);
        appendChange(new TattooSessionCreated(projectName, numberOfSession)).apply();
    }

    public void updateProjectName(Name name){
        appendChange(new ProjectNameUpdated(name)).apply();
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

//    public void addAppointment(AppointmentID appointmentId, Date date, Hour hour){
//        Objects.requireNonNull(appointmentId);
//        Objects.requireNonNull(date);
//        Objects.requireNonNull(hour);
//        appendChange(new AppointmentAdded(appointmentId, date, hour)).apply();
//    }
//
//    public void updateArtistName(Name name){
//        appendChange(new ArtistNameUpdated(name)).apply();
//    }
//
//    public void updateArtistSpecialization(ArtistID entityId, Specialization specialization){
//        appendChange(new ArtistSpecializationUpdated(specialization)).apply();
//    }
//
//    public void updateClientName(ArtistID entityId, Name name){
//        appendChange(new ClientNameUpdated(name)).apply();
//    }
//
//    public void updateClientsPhoneNumber(ArtistID entityId, PhoneNumber phoneNumber){
//        appendChange(new ClientPhoneNumberUpdated(phoneNumber)).apply();
//    }

//    public Optional<Artist> getArtistById(ArtistID artistID){
//        return artists()
//                .stream()
//                .filter(artist -> artist.identity().equals(artistID))
//                .findFirst();
//    }
//
//    public Optional<Client> getClientById(ClientID clientID){
//        return clients()
//                .stream()
//                .filter(client -> client.identity().equals(clientID))
//                .findFirst();
//    }

    public Name projectName() {
        return projectName;
    }

    public NumberOfSession numberOfSession() {
        return numberOfSession;
    }

    public Artist artist() {
        return artist;
    }

    public Client client() {
        return client;
    }
}
