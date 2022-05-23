package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Technique implements ValueObject<TechniquesEnum> {
    private final TechniquesEnum technique;

    public Technique(TechniquesEnum technique) {
        this.technique = Objects.requireNonNull(technique);
    }

    @Override
    public TechniquesEnum value() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Technique technique1 = (Technique) o;
        return technique == technique1.technique;
    }

    @Override
    public int hashCode() {
        return Objects.hash(technique);
    }
}
