package com.sofka.dddchallenge.domain.tools.commands;

import co.com.sofka.domain.generic.Command;
import com.sofka.dddchallenge.domain.tools.values.Stretcher;
import com.sofka.dddchallenge.domain.tools.values.Table;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

public class CreateTools extends Command {

    private final ToolsID toolsID;
    private final Table table;
    private final Stretcher stretcher;

    public CreateTools(ToolsID toolsID, Table table, Stretcher stretcher) {

        this.toolsID = toolsID;
        this.table = table;
        this.stretcher = stretcher;
    }

    public ToolsID getToolsID() {
        return toolsID;
    }

    public Table getTable() {
        return table;
    }

    public Stretcher getStretcher() {
        return stretcher;
    }
}
