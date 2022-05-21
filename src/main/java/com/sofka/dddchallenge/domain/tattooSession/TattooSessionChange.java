package com.sofka.dddchallenge.domain.tattooSession;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.dddchallenge.domain.tattooSession.events.*;

public class TattooSessionChange extends EventChange {
    public TattooSessionChange(TattooSession tattooSession) {

        apply((TattooSessionCreated event) -> {
            tattooSession.projectName = event.getProjectName();
            tattooSession.numberOfSession = event.getNumberOfSession();
        });

        apply((ProjectNameUpdated event) -> {
            tattooSession.projectName = event.getProjectName();
        });

        apply((NumberOfSessionUpdated event) -> {
            tattooSession.numberOfSession = event.getNumberOfSession();
        });

        apply((AppointmentAdded event) -> {
            tattooSession.appointment = new Appointment(event.getAppointmentID(), event.getDate(), event.getHour());
        });

        apply((AppointmentDateUpdated event) -> {
            var appointment = tattooSession.appointment;
            if (appointment == null) {
                throw new NullPointerException("appointment not added yet");
            }
            appointment.updateDate(event.getDate());
        });

        apply((AppointmentHourUpdated event) -> {
            var appointment = tattooSession.appointment;
            if (appointment == null) {
                throw new NullPointerException("appointment not added yet");
            }
            appointment.UpdateHour(event.getHour());
        });

        apply((ArtistAdded event) -> {
            tattooSession.artist = new Artist(event.getArtistID(), event.getName(), event.getSpecialization());
        });

        apply((ArtistNameUpdated event) -> {
            var artist = tattooSession.artist;
            if (artist == null) {
                throw new NullPointerException("artist not added yet");
            }
            artist.updateName(event.getName());
        });

        apply((ArtistSpecializationUpdated event) ->{
            var artist = tattooSession.artist;
            if (artist == null) {
                throw new NullPointerException("artist not added yet");
            }
            artist.updateSpecialization(event.getSpecialization());
        });

        apply((ClientAdded event) ->{
            tattooSession.client = new Client(event.getClientID(), event.getName(), event.getPhoneNumber());
        });

        apply((ClientNameUpdated event) -> {
            var client = tattooSession.client;
            if (client == null) {
                throw new NullPointerException("client not added yet");
            }
            client.updateName(event.getName());
        });

        apply((ClientPhoneNumberUpdated event) -> {
            var client = tattooSession.client;
            if (client == null) {
                throw new NullPointerException("client not added yet");
            }
            client.updatePhoneNumber(event.getPhoneNumber());
        });

    }
}
