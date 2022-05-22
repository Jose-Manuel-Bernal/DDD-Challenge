package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Color;
import com.sofka.dddchallenge.domain.tools.values.InkID;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateInkColor extends Command {
    private final ToolsID toolsID;
    private final InkID inkID;
    private final Color color;

    public UpdateInkColor(ToolsID toolsID, InkID inkID, Color color) {
        this.toolsID = toolsID;
        this.inkID = inkID;
        this.color = color;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Color getColor() {
        return color;
    }
}
