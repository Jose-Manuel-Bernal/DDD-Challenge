package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Color implements ValueObject<ColorsEnum> {
    private ColorsEnum color;

    public Color(ColorsEnum color){
        this.color = Objects.requireNonNull(color);
    }

    @Override
    public ColorsEnum value(){return color;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Color color1 = (Color) o;
        return color == color1.color;
    }

    @Override
    public int hashCode() {
        return Objects.hash(color);
    }
}
