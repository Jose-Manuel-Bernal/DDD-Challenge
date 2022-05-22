package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.InkID;

public class InkBrandUpdated extends DomainEvent {
    private final InkID inkID;
    private final Brand brand;

    public InkBrandUpdated(InkID inkID, Brand brand){
        super("sofka.tools.inkbrandupdated");
        this.inkID = inkID;
        this.brand = brand;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Brand getBrand() {
        return brand;
    }
}
