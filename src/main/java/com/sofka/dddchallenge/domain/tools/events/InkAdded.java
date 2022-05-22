package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.Color;
import com.sofka.dddchallenge.domain.tools.values.Cuantity;
import com.sofka.dddchallenge.domain.tools.values.InkID;

public class InkAdded extends DomainEvent {

    private final InkID inkID;
    private Brand brand;
    private Color color;
    private Cuantity cuantity;

    public InkAdded(InkID inkID, Brand brand, Color color, Cuantity cuantity){
        super("sofka.tools.inkadded");
        this.inkID = inkID;
        this.brand = brand;
        this.color = color;
        this.cuantity = cuantity;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public Cuantity getCuantity() {
        return cuantity;
    }
}
