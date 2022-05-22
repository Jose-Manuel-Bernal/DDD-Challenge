package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.MachineID;
import com.sofka.dddchallenge.domain.tools.values.TypeOfMachine;

public class MachineAdded extends DomainEvent {

    private final MachineID machineID;
    private final Brand brand;
    private final TypeOfMachine typeOfMachine;

    public MachineAdded(MachineID machineID, Brand brand, TypeOfMachine typeOfMachine){
        super("sofka.tools.machineadded");
        this.machineID = machineID;
        this.brand = brand;
        this.typeOfMachine = typeOfMachine;
    }

    public MachineID getMachineID() {
        return machineID;
    }

    public Brand getBrand() {
        return brand;
    }

    public TypeOfMachine getTypeOfMachine() {
        return typeOfMachine;
    }
}
