package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Name implements ValueObject<String> {
    private String name;

    public Name(String name){
        this.name = Objects.requireNonNull(name);
        if (name.isBlank()) {
            throw new IllegalArgumentException("The name is empty");
        }
    }
    public String value() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Name name1 = (Name) o;
        return Objects.equals(name, name1.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
