package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class BodyArea implements ValueObject<String>{
    private String bodyArea;

    public BodyArea (String bodyArea){
        this.bodyArea = Objects.requireNonNull(bodyArea);
        if (bodyArea.isBlank()) {
            throw new IllegalArgumentException("The bodyArea is empty");
        }
    }

    @Override
    public String value() {
        return bodyArea;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BodyArea bodyArea1 = (BodyArea) o;
        return Objects.equals(bodyArea, bodyArea1.bodyArea);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodyArea);
    }
}
