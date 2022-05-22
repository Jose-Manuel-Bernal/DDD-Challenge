package com.sofka.dddchallenge.domain.tattooSession;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.events.*;
import com.sofka.dddchallenge.domain.tattooSession.values.*;

import java.util.List;
import java.util.Objects;

public class TattooSession extends AggregateEvent<TattooSessionID> {
    protected Name projectName;
    protected NumberOfSession numberOfSession;
    protected Artist artist;
    protected Client client;
    protected Appointment appointment;

    //Para crear agregado, cuando es nuevo.
    public TattooSession(TattooSessionID entityId, Name projectName, NumberOfSession numberOfSession) {
        super(entityId);
        appendChange(new TattooSessionCreated(projectName, numberOfSession)).apply();
    }

    private TattooSession(TattooSessionID tattooSessionID){
        super(tattooSessionID);
        subscribe(new TattooSessionChange(this));
    }

    public static TattooSession from(TattooSessionID tattooSessionID, List<DomainEvent> events){
        var tattooSession = new TattooSession(tattooSessionID);
        events.forEach(tattooSession::applyEvent);
        return tattooSession;
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

    public void addAppointment(AppointmentID appointmentId, Date date, Hour hour){
        Objects.requireNonNull(appointmentId);
        Objects.requireNonNull(date);
        Objects.requireNonNull(hour);
        appendChange(new AppointmentAdded(appointmentId, date, hour)).apply();
    }

    public void updateArtistName(Name name){
        appendChange(new ArtistNameUpdated(name)).apply();
    }

    public void updateArtistSpecialization(Specialization specialization){
        appendChange(new ArtistSpecializationUpdated(specialization)).apply();
    }

    public void updateClientName(Name name){
        appendChange(new ClientNameUpdated(name)).apply();
    }

    public void updateClientsPhoneNumber(PhoneNumber phoneNumber){
        appendChange(new ClientPhoneNumberUpdated(phoneNumber)).apply();
    }

    public void updateAppointmentDate(Date date){
        appendChange(new AppointmentDateUpdated(date)).apply();
    }

    public void updateAppointmentHour(Hour hour){
        appendChange(new AppointmentHourUpdated(hour)).apply();
    }

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
