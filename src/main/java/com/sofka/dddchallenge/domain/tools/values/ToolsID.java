package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.Identity;

public class ToolsID extends Identity {

    public ToolsID(){}

    private ToolsID(String id){
        super(id);
    }

    public ToolsID of(String id){
        return new ToolsID(id);
    }
}
