package com.sofka.dddchallenge.domain.tools;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import com.sofka.dddchallenge.domain.tattooSession.TattooSession;
import com.sofka.dddchallenge.domain.tattooSession.values.TattooSessionID;
import com.sofka.dddchallenge.domain.tools.events.*;
import com.sofka.dddchallenge.domain.tools.values.*;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Tools extends AggregateEvent<ToolsID> {
    protected Table table;
    protected Stretcher stretcher;
    protected Desing desing;
    protected Machine machine;
    protected Set<Ink> inks;


    public Tools(ToolsID entityId, Stretcher stretcher, Table table) {
        super(entityId);
        appendChange(new ToolsCreated(table, stretcher)).apply();
    }

    private Tools(ToolsID toolsID){
        super(toolsID);
        subscribe(new ToolsChange(this));
    }

    public static Tools from(ToolsID toolsID, List<DomainEvent> events){
        var tools = new Tools(toolsID);
        events.forEach(tools::applyEvent);
        return tools;
    }

    public void updateTable(Table table){
        appendChange(new TableUpdated(table)).apply();
    }

    public void updateStretcher(Stretcher stretcher){
        appendChange(new StretcherUpdated(stretcher)).apply();
    }

    public void addDesing(DesingID desingID,
                          Name name,
                          Style style,
                          Technique technique,
                          BodyArea bodyArea){
        Objects.requireNonNull(desingID);
        Objects.requireNonNull(name);
        Objects.requireNonNull(style);
        Objects.requireNonNull(technique);
        Objects.requireNonNull(bodyArea);
        appendChange(new DesingAdded(desingID, name,style,technique,bodyArea)).apply();
    }

    public void addInk(InkID inkID, Brand brand, Color color, Cuantity cuantity){
        Objects.requireNonNull(inkID);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(color);
        Objects.requireNonNull(cuantity);
        appendChange(new InkAdded(inkID, brand, color, cuantity)).apply();
    }

    public void addMachine(MachineID machineID, Brand brand, TypeOfMachine typeOfMachine){
        Objects.requireNonNull(machineID);
        Objects.requireNonNull(brand);
        Objects.requireNonNull(typeOfMachine);
        appendChange(new MachineAdded(machineID, brand, typeOfMachine)).apply();
    }

    public void updateDesingName(Name name){
        appendChange(new DesingNameUpdated(name)).apply();
    }

    public void updateDesingStyle(Style style){
        appendChange(new DesingStyleUpdated(style)).apply();
    }

    public void updateDesingTechnique(Technique technique){
        appendChange(new DesingTechniqueUpdated(technique)).apply();
    }

    public void updateDesingBodyArea(BodyArea bodyArea){
        appendChange(new DesingBodyAreaUpdated(bodyArea)).apply();
    }

    public void updateMachineBrand(Brand brand){
        appendChange(new MachineBrandUpdated(brand)).apply();
    }

    public void updateMachineTypeOfmachine(TypeOfMachine typeOfMachine){
        appendChange(new MachineTypeOfMachineUpdated(typeOfMachine)).apply();
    }

    public void updateInkBrand(InkID inkID, Brand brand){
        appendChange(new InkBrandUpdated(inkID, brand)).apply();
    }

    public void updateInkColor(InkID inkID, Color color){
        appendChange(new InkColorUpdated(inkID, color)).apply();
    }

    public void updateInkCuantity(InkID inkID, Cuantity cuantity){
        appendChange(new InkCuantityUpdated(inkID, cuantity)).apply();
    }

    public Optional<Ink> getInktById(InkID inkID){
        return inks()
                .stream()
                .filter(ink -> ink.identity().equals(inkID))
                .findFirst();
    }

    public Table table() {
        return table;
    }

    public Stretcher stretcher() {
        return stretcher;
    }

    public Set<Ink> inks() {
        return inks;
    }
}
