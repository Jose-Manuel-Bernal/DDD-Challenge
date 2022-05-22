package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Style;

public class DesingStyleUpdated extends DomainEvent {
    private final Style style;

    public DesingStyleUpdated(Style style){
        super("sofka.tools.desingnameupdated");
        this.style = style;
    }

    public Style getStyle() {
        return style;
    }
}
