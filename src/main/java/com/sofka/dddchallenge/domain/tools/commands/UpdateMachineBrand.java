package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateMachineBrand extends Command {
    private final ToolsID toolsID;
    private final Brand brand;

    public UpdateMachineBrand(ToolsID toolsID, Brand brand) {
        this.toolsID = toolsID;
        this.brand = brand;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Brand getBrand() {
        return brand;
    }
}
