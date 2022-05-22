package com.sofka.dddchallenge.domain.tools;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.MachineID;
import com.sofka.dddchallenge.domain.tools.values.TypeOfMachine;

import java.util.Objects;

public class Machine extends Entity<MachineID> {
    private Brand brand;
    private TypeOfMachine typeOfMachine;

    public Machine(MachineID entityId, Brand brand, TypeOfMachine typeOfMachine) {
        super(entityId);
        this.brand = brand;
        this.typeOfMachine = typeOfMachine;
    }

    public void updateBrand(Brand brand){
        this.brand = Objects.requireNonNull(brand);
    }

    public void updateTypeOfMachine(TypeOfMachine typeOfMachine){
        this.typeOfMachine = Objects.requireNonNull(typeOfMachine);
    }

    public Brand brand() {
        return brand;
    }

    public TypeOfMachine typeOfMachine() {
        return typeOfMachine;
    }
}
