package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Technique;

public class DesingTechniqueUpdated extends DomainEvent {
    private Technique technique;

    public DesingTechniqueUpdated(Technique technique){
        super("sofka.tools.desingtechniqueupdated");
        this.technique = technique;
    }

    public Technique getTechnique() {
        return technique;
    }
}
