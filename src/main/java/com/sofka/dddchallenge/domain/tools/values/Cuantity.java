package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Cuantity implements ValueObject<Float> {
    private Float cuantity;

    public Cuantity(Float cuantity) {
        this.cuantity = Objects.requireNonNull(cuantity);
        if (cuantity <= 0) {
            throw new IllegalArgumentException("Cuantity must be > 0");
        }
    }

    @Override
    public Float value() {
        return cuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cuantity cuantity1 = (Cuantity) o;
        return Objects.equals(cuantity, cuantity1.cuantity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cuantity);
    }
}
