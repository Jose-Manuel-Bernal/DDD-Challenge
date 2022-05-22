package com.sofka.dddchallenge.domain.tools;

import co.com.sofka.domain.generic.EventChange;
import com.sofka.dddchallenge.domain.tools.events.*;
import com.sofka.dddchallenge.domain.tools.values.ToolsID;

import java.util.HashSet;

public class ToolsChange extends EventChange {
    public ToolsChange(Tools tools){

        apply((ToolsCreated event) -> {
            tools.table = event.getTable();
            tools.stretcher = event.getStretcher();
            tools.inks = new HashSet<>();
        });

        apply((TableUpdated event) -> {
            tools.table = event.getTable();
        });

        apply((StretcherUpdated event) ->{
            tools.stretcher = event.getStretcher();
        });

        apply((DesingAdded event) -> {
            tools.desing = new Desing(event.getDesingId(), event.getName(), event.getStyle(), event.getTechnique(), event.getBodyArea());
        });

        apply((DesingBodyAreaUpdated event) -> {
            var desing = tools.desing;
            if (desing == null) {
                throw new NullPointerException("desing not added yet");
            }
            desing.updateBodyArea(event.getBodyArea());
        });

        apply((DesingNameUpdated event) -> {
            var desing = tools.desing;
            if (desing == null) {
                throw new NullPointerException("desing not added yet");
            }
            desing.updateName(event.getName());
        });

        apply((DesingStyleUpdated event) -> {
            var desing = tools.desing;
            if (desing == null) {
                throw new NullPointerException("desing not added yet");
            }
            desing.updateStyle(event.getStyle());
        });

        apply((DesingTechniqueUpdated event) ->{
            var desing = tools.desing;
            if (desing == null) {
                throw new NullPointerException("desing not added yet");
            }
            desing.updateTechnique(event.getTechnique());
        });

        apply((InkAdded event) ->{
            tools.inks.add(new Ink(event.getInkID(),
                    event.getBrand(),
                    event.getColor(),
                    event.getCuantity()));
        });

        apply((InkBrandUpdated event) ->{
            var ink = tools.getInktById(event.getInkID())
                    .orElseThrow(()->new IllegalArgumentException("cannot find ink with this ID"));
            ink.updateBrand(event.getBrand());
        });

        apply((InkColorUpdated event) -> {
            var ink = tools.getInktById(event.getInkID())
                    .orElseThrow(()->new IllegalArgumentException("cannot find ink with this ID"));
            ink.updateColor(event.getColor());
        });

        apply((InkCuantityUpdated event) -> {
            var ink = tools.getInktById(event.getInkID())
                    .orElseThrow(()->new IllegalArgumentException("cannot find ink with this ID"));
            ink.updateCuantity(event.getCuantity());
        });

        apply((MachineAdded event) ->{
            tools.machine = new Machine(event.getMachineID(), event.getBrand(), event.getTypeOfMachine());
        });

        apply((MachineBrandUpdated event) ->{
            var machine = tools.machine;
            if (machine == null) {
                throw new NullPointerException("machine not added yet");
            }
            machine.updateBrand(event.getBrand());
        });

        apply((MachineTypeOfMachineUpdated event) -> {
            var machine = tools.machine;
            if (machine == null) {
                throw new NullPointerException("machine not added yet");
            }
            machine.updateTypeOfMachine(event.getTypeOfMachine());
        });
    }
}
