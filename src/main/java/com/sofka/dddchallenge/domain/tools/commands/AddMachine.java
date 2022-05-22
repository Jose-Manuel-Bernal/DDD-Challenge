package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.MachineID;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;
import com.sofka.dddchallenge.domain.tools.values.TypeOfMachine;

public class AddMachine extends Command {

    private final ToolsID toolsID;
    private final MachineID machineID;
    private final Brand brand;
    private final TypeOfMachine typeOfMachine;

    public AddMachine(ToolsID toolsID, MachineID machineID, Brand brand, TypeOfMachine typeOfMachine) {
        this.toolsID = toolsID;
        this.machineID = machineID;
        this.brand = brand;
        this.typeOfMachine = typeOfMachine;
    }

    public ToolsID getToolsID() {
        return toolsID;
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
