package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class NumberOfSession implements ValueObject<Integer> {
    private Integer numberOfSession;

    public NumberOfSession (Integer numberOfSession){
        this.numberOfSession = Objects.requireNonNull(numberOfSession);
        if (numberOfSession <= 0) {
            throw new IllegalArgumentException("The number of session must be greater than 0");
        }
    }

    public Integer value() {
        return numberOfSession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NumberOfSession that = (NumberOfSession) o;
        return Objects.equals(numberOfSession, that.numberOfSession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numberOfSession);
    }
}
