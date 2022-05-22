package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Color;
import com.sofka.dddchallenge.domain.tools.values.InkID;

public class InkColorUpdated extends DomainEvent {
    private final InkID inkID;
    private final Color color;

    public InkColorUpdated(InkID inkID, Color color){
        super("sofka.tools.inkcolorupdated");
        this.inkID = inkID;
        this.color = color;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Color getColor() {
        return color;
    }
}
