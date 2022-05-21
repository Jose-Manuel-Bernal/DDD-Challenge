package com.sofka.dddchallenge.domain.tattooSession.values;

import co.com.sofka.domain.generic.Identity;

public class TattooSessionID extends Identity {

    public TattooSessionID() {}

    private TattooSessionID(String id){
        super(id);
    }

    public  TattooSessionID of(String id){
        return new TattooSessionID(id);
    }
}
