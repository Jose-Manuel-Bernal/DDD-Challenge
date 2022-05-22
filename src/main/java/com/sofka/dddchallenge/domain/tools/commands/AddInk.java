package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.*;

public class AddInk extends Command {

    private final ToolsID toolsID;
    private final InkID inkID;
    private final Brand brand;
    private final Color color;
    private final Cuantity cuantity;

    public AddInk(ToolsID toolsID, InkID inkID, Brand brand, Color color, Cuantity cuantity) {
        this.toolsID = toolsID;
        this.inkID = inkID;
        this.brand = brand;
        this.color = color;
        this.cuantity = cuantity;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Brand getBrand() {
        return brand;
    }

    public Color getColor() {
        return color;
    }

    public Cuantity getCuantity() {
        return cuantity;
    }
}
