package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.Identity;

public class InkID extends Identity {

    public  InkID(){}

    private InkID(String id){
        super(id);
    }
    public InkID of(String id){
        return new InkID(id);
    }
}
