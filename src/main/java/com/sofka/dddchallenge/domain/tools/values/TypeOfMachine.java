package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class TypeOfMachine implements ValueObject<TypeOfMachinesEnums> {
    private final TypeOfMachinesEnums typeOfMachines;

    public TypeOfMachine(TypeOfMachinesEnums typeOfMachines) {
        this.typeOfMachines = Objects.requireNonNull(typeOfMachines);
    }

    @Override
    public TypeOfMachinesEnums value() {
        return typeOfMachines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeOfMachine that = (TypeOfMachine) o;
        return typeOfMachines == that.typeOfMachines;
    }

    @Override
    public int hashCode() {
        return Objects.hash(typeOfMachines);
    }
}
