package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateStretcher extends Command {

    private final ToolsID toolsID;
    private final Stretcher stretcher;

    public UpdateStretcher(ToolsID toolsID, Stretcher stretcher) {
        this.toolsID = toolsID;
        this.stretcher = stretcher;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Stretcher getStretcher() {
        return stretcher;
    }
}
