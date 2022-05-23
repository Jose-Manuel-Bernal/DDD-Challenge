package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Style implements ValueObject<StylesEnum> {
    private final StylesEnum style;

    public Style(StylesEnum style) {
        this.style = Objects.requireNonNull(style);
    }

    @Override
    public StylesEnum value() {
        return style;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Style style1 = (Style) o;
        return style == style1.style;
    }

    @Override
    public int hashCode() {
        return Objects.hash(style);
    }
}
