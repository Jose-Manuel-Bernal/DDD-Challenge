package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;

public class StretcherUpdated extends DomainEvent {

    private final Stretcher stretcher;

    public StretcherUpdated(Stretcher stretcher){
        super("sofka.tools.stretcherupdated");
        this.stretcher = stretcher;
    }

    public Stretcher getStretcher() {
        return stretcher;
    }
}
