package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Stretcher implements ValueObject<Boolean> {
    private Boolean stretcher;

    public Stretcher(Boolean stretcher) {
        this.stretcher = Objects.requireNonNull(stretcher);
    }

    @Override
    public Boolean value() {
        return stretcher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stretcher stretcher1 = (Stretcher) o;
        return Objects.equals(stretcher, stretcher1.stretcher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stretcher);
    }
}
