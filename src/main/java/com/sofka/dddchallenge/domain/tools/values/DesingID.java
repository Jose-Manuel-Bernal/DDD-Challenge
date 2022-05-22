package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.Identity;

public class DesingID extends Identity {

    public DesingID(){}

    private DesingID(String id){
        super(id);
    }

    public DesingID of(String id) {
        return new DesingID(id);
    }
}
