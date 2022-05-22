package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Cuantity;
import com.sofka.dddchallenge.domain.tools.values.InkID;

public class InkCuantityUpdated extends DomainEvent {
    private final InkID inkID;
    private final Cuantity cuantity;

    public InkCuantityUpdated(InkID inkID, Cuantity cuantity){
        super("sofa.tools.inkcuantityupdated");
        this.inkID = inkID;
        this.cuantity = cuantity;
    }

    public InkID getInkID() {
        return inkID;
    }

    public Cuantity getCuantity() {
        return cuantity;
    }
}
