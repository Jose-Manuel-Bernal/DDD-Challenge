package com.sofka.dddchallenge.domain.tools;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.Color;
import com.sofka.dddchallenge.domain.tools.values.Cuantity;
import com.sofka.dddchallenge.domain.tools.values.InkID;

import java.util.Objects;

public class Ink extends Entity<InkID> {
    private Brand brand;
    private Color color;
    private Cuantity cuantity;

    public Ink(InkID entityId, Brand brand, Color color, Cuantity cuantity) {
        super(entityId);
        this.brand = brand;
        this.color = color;
        this.cuantity = cuantity;
    }

    public void updateBrand(Brand brand) {
        this.brand = Objects.requireNonNull(brand);
    }

    public void updateColor(Color color){
        this.color = Objects.requireNonNull(color);
    }

    public void updateCuantity(Cuantity cuantity){
        this.cuantity = Objects.requireNonNull(cuantity);
    }

    public Brand brand() {
        return brand;
    }

    public Color color() {
        return color;
    }

    public Cuantity cuantity() {
        return cuantity;
    }
}
