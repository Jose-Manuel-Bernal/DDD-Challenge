package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalTime;
import java.util.Objects;

public class Hour implements ValueObject<LocalTime> {
    private final LocalTime hour;

    public Hour(Integer hours, Integer minutes, Integer seconds){
        Objects.requireNonNull(hours);
        Objects.requireNonNull(minutes);
        Objects.requireNonNull(seconds);
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
