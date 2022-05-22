package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Brand;
import com.sofka.dddchallenge.domain.tools.values.InkID;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateInkBrand extends Command {
    private final ToolsID toolsID;
    private final InkID inkID;
    private final Brand brand;

    public UpdateInkBrand(ToolsID toolsID, InkID inkID, Brand brand) {
        this.toolsID = toolsID;
        this.inkID = inkID;
        this.brand = brand;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Brand getBrand() {
        return brand;
    }
}
