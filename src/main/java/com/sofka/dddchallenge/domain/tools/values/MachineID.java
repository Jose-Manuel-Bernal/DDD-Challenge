package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.Identity;

public class MachineID extends Identity {

    public MachineID(){}

    private MachineID(String id){
        super(id);
    }

    public MachineID of(String id) {
        return new MachineID(id);
    }
}
