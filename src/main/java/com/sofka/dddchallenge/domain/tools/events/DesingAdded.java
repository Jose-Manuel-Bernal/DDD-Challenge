package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.*;

public class DesingAdded extends DomainEvent {

    private final DesingID desingId;
    private final Name name;
    private final Style style;
    private final Technique technique;
    private final BodyArea bodyArea;

    public DesingAdded(DesingID desingID,
                       Name name,
                       Style style,
                       Technique technique,
                       BodyArea bodyArea) {
        super("sofka.tools.desingadded");
        this.desingId = desingID;
        this.name = name;
        this.style = style;
        this.technique = technique;
        this.bodyArea = bodyArea;
    }

    public DesingID getDesingId() {
        return desingId;
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
