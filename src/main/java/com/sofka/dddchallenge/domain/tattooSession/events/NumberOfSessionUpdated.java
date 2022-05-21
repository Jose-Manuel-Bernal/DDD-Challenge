package com.sofka.dddchallenge.domain.tattooSession.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.values.NumberOfSession;

public class NumberOfSessionUpdated extends DomainEvent {
    private final NumberOfSession numberOfSession;

    public NumberOfSessionUpdated(NumberOfSession numberOfSession) {
        super("sofka.tattoosession.numberofsessionupdated");
        this.numberOfSession = numberOfSession;
    }

    public NumberOfSession getNumberOfSession() {return numberOfSession;}
}
