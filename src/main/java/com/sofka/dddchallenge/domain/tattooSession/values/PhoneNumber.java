package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class PhoneNumber implements ValueObject<String> {
    private String phoneNumber;

    public PhoneNumber(String phoneNumber){
        this.phoneNumber = Objects.requireNonNull(phoneNumber);
        if (phoneNumber.isBlank()) {
            throw new IllegalArgumentException("The phone number is empty");
        }
        if (phoneNumber.length() != 10) {
            throw new IllegalArgumentException("Phone Number must be 10 digits.");
        }
    }

    public String value() {
        return phoneNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneNumber that = (PhoneNumber) o;
        return Objects.equals(phoneNumber, that.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(phoneNumber);
    }
}
