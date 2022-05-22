package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;
import com.sofka.dddchallenge.domain.tools.values.Table;

public class ToolsCreated extends DomainEvent {
    private final Table table;
    private final Stretcher stretcher;

    public ToolsCreated(Table table, Stretcher stretcher){
        super("sofka.tools.toolscreated");
        this.table = table;
        this.stretcher = stretcher;
    }

    public Table getTable() {
        return table;
    }

    public Stretcher getStretcher() {
        return stretcher;
    }
}
