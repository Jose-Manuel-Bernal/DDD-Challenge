package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Technique;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateDesingTechnique extends Command {
    private final ToolsID toolsID;
    private final Technique technique;

    public UpdateDesingTechnique(ToolsID toolsID, Technique technique) {
        this.toolsID = toolsID;
        this.technique = technique;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Technique getTechnique() {
        return technique;
    }
}
