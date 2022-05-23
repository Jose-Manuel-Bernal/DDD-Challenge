package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Specialization implements ValueObject<String> {
    private final String specialization;

    public Specialization(String specialization){
        this.specialization = Objects.requireNonNull(specialization);
        if (specialization.isBlank()) {
            throw new IllegalArgumentException("The specialization is empty");
        }
    }

    public String value() {
        return specialization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Specialization that = (Specialization) o;
        return Objects.equals(specialization, that.specialization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(specialization);
    }
}
