package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Objects;

public class Date implements ValueObject<LocalDate> {
    private LocalDate date;

    public Date(Integer year, Integer month, Integer day) {
        Objects.requireNonNull(year);
        Objects.requireNonNull(month);
        Objects.requireNonNull(day);
        try {
            date = LocalDate.of(year, month, day);
            if(date.isAfter(LocalDate.now())){
                throw new IllegalArgumentException("No valid the date of birth");
            }
        } catch (DateTimeException e){
            throw new IllegalArgumentException(e.getMessage());
        }
    }

    public LocalDate value() {
        return date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Date date1 = (Date) o;
        return Objects.equals(date, date1.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date);
    }
}
