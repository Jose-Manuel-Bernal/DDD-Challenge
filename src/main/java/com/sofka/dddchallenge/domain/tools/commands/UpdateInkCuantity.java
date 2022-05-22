package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Cuantity;
import com.sofka.dddchallenge.domain.tools.values.InkID;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateInkCuantity extends Command {
    private final ToolsID toolsID;
    private final InkID inkID;
    private final Cuantity cuantity;

    public UpdateInkCuantity(ToolsID toolsID, InkID inkID, Cuantity cuantity) {
        this.toolsID = toolsID;
        this.inkID = inkID;
        this.cuantity = cuantity;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Cuantity getCuantity() {
        return cuantity;
    }
}
