package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.*;

public class AddDesing extends Command {

    private final ToolsID toolsID;
    private final DesingID desingID;
    private final Name name;
    private final Style style;
    private final Technique technique;
    private final BodyArea bodyArea;

    public AddDesing(ToolsID toolsID, DesingID desingID,
                     Name name,
                     Style style,
                     Technique technique,
                     BodyArea bodyArea) {

        this.toolsID = toolsID;
        this.desingID = desingID;
        this.name = name;
        this.style = style;
        this.technique = technique;
        this.bodyArea = bodyArea;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public DesingID getDesingID() {
        return desingID;
    }

    public Name getName() {
        return name;
    }

    public Style getStyle() {
        return style;
    }

    public Technique getTechnique() {
        return technique;
    }

    public BodyArea getBodyArea() {
        return bodyArea;
    }
}
