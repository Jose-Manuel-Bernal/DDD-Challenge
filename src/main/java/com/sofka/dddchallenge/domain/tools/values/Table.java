package com.sofka.dddchallenge.domain.tools.values;

import co.com.sofka.domain.generic.ValueObject;

import java.util.Objects;

public class Table implements ValueObject<Boolean> {
    private final Boolean table;

    public Table(Boolean table) {
        this.table = Objects.requireNonNull(table);
    }

    @Override
    public Boolean value() {
        return table;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Table table1 = (Table) o;
        return Objects.equals(table, table1.table);
    }

    @Override
    public int hashCode() {
        return Objects.hash(table);
    }
}
