package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Style;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateDesingStyle extends Command {

    private final ToolsID toolsID;
    private final Style style;

    public UpdateDesingStyle(ToolsID toolsID, Style style) {
        this.toolsID = toolsID;
        this.style = style;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Style getStyle() {
        return style;
    }
}
