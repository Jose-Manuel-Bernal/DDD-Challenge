package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalTime;

public class Hour implements ValueObject<LocalTime> {
    public LocalTime hour;

    public Hour(int hours, int minutes, int seconds){
        try{
            hour = LocalTime.of(hours,minutes,seconds);
            if (hour.isAfter(LocalTime.of(18,0,0))) {
                throw new IllegalArgumentException("No valid hour for schedule");
            }
        }catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public LocalTime value() {
        return hour;
    }
}
