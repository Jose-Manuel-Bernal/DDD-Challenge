package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;
import com.sofka.dddchallenge.domain.tools.values.TypeOfMachine;

public class UpdateMachineTypeOfmachine extends Command {
    private final ToolsID toolsID;
    private final TypeOfMachine typeOfMachine;

    public UpdateMachineTypeOfmachine(ToolsID toolsID, TypeOfMachine typeOfMachine) {
        this.toolsID = toolsID;
        this.typeOfMachine = typeOfMachine;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public TypeOfMachine getTypeOfMachine() {
        return typeOfMachine;
    }
}
