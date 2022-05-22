package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Name;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateDesingName extends Command {

    private final ToolsID toolsID;
    private final Name name;

    public UpdateDesingName(ToolsID toolsID, Name name) {
        this.toolsID = toolsID;
        this.name = name;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Name getName() {
        return name;
    }
}
