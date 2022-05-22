package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.BodyArea;

public class DesingBodyAreaUpdated extends DomainEvent {
    private final BodyArea bodyArea;

    public DesingBodyAreaUpdated(BodyArea bodyArea){
        super("sofka.tools.desingbodyareaupdated");
        this.bodyArea = bodyArea;
    }

    public BodyArea getBodyArea() {
        return bodyArea;
    }
}
