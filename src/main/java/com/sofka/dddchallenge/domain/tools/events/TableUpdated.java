package com.sofka.dddchallenge.domain.tools.events;

import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tools.values.Table;

public class TableUpdated extends DomainEvent {

    private final Table table;

    public TableUpdated(Table table) {
        super("sofka.tools.tableupdated");
        this.table = table;
    }

    public Table getTable() {
        return table;
    }
}
