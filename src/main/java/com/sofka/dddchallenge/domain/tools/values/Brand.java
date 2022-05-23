package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Brand implements ValueObject<BrandsEnum> {
    private final BrandsEnum brand;

    public Brand(BrandsEnum brand) {
        this.brand = Objects.requireNonNull(brand);
    }

    @Override
    public BrandsEnum value() {
        return brand;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Brand brand1 = (Brand) o;
        return brand == brand1.brand;
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand);
    }
}
