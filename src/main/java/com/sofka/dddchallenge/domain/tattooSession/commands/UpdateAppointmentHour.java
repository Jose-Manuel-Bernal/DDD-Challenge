package com.sofka.dddchallenge.domain.tattooSession.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tattooSession.values.Hour;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;

public class UpdateAppointmentHour extends Command {
    private final TattooSessionID tattooSessionID;
    private final Hour hour;

    public UpdateAppointmentHour(TattooSessionID tattooSessionID, Hour hour) {
        this.tattooSessionID = tattooSessionID;
        this.hour = hour;
    }

    public TattooSessionID getTattooSessionID() {
        return tattooSessionID;
    }

    public Hour getHour() {
        return hour;
    }
}
