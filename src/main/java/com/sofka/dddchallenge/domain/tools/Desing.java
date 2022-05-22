package com.sofka.dddchallenge.domain.tools;

import co.com.sofka.domain.generic.Entity;
import com.sofka.dddchallenge.domain.tools.values.*;

import java.util.Objects;

public class Desing extends Entity<DesingID> {
    private Name name;
    private Style style;
    private Technique technique;
    private BodyArea bodyArea;

    public Desing(DesingID desingID, Name name,
                  Style style,
                  Technique technique,
                  BodyArea bodyArea) {
        super(desingID);
        this.name = name;
        this.style = style;
        this.technique = technique;
        this.bodyArea = bodyArea;
    }

    public void updateName(Name name){
        this.name = Objects.requireNonNull(name);
    }

    public void updateStyle(Style style){
        this.style = Objects.requireNonNull(style);
    }

    public void updateTechnique(Technique technique){
        this.technique = Objects.requireNonNull(technique);
    }

    public void updateBodyArea(BodyArea bodyArea){
        this.bodyArea = Objects.requireNonNull(bodyArea);
    }

    public Name name() {
        return name;
    }

    public Style style() {
        return style;
    }

    public Technique technique() {
        return technique;
    }

    public BodyArea bodyArea() {
        return bodyArea;
    }
}
