package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.TypeOfMachine;

public class MachineTypeOfMachineUpdated extends DomainEvent {
    private TypeOfMachine typeOfMachine;

    public MachineTypeOfMachineUpdated(TypeOfMachine typeOfMachine){
        super("sofka.tools.machinetypeofmachineupdated");
        this.typeOfMachine= typeOfMachine;
    }

    public TypeOfMachine getTypeOfMachine() {
        return typeOfMachine;
    }
}
