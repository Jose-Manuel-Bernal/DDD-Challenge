package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Table;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class UpdateTable extends Command {

    private final ToolsID toolsID;
    private final Table table;

    public UpdateTable(ToolsID toolsID, Table table) {

        this.toolsID = toolsID;
        this.table = table;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Table getTable() {
        return table;
    }
}
