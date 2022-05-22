package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Brand;

public class MachineBrandUpdated extends DomainEvent {
    private final Brand brand;

    public MachineBrandUpdated(Brand brand){
        super("sofka.tools.machinebrandupdated");
        this.brand = brand;
    }

    public Brand getBrand() {
        return brand;
    }
}
