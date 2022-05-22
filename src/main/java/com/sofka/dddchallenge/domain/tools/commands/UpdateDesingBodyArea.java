package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.BodyArea;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateDesingBodyArea extends Command {
    private final ToolsID toolsID;
    private final BodyArea bodyArea;

    public UpdateDesingBodyArea(ToolsID toolsID, BodyArea bodyArea) {
        this.toolsID = toolsID;
        this.bodyArea = bodyArea;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public BodyArea getBodyArea() {
        return bodyArea;
    }
}
