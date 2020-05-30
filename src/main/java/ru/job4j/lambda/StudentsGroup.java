package ru.job4j.lambda;

import java.util.Set;

public class StudentsGroup {
    private String name;
    private Set <String> units;

    public StudentsGroup(String name, Set<String> units) {
        this.name = name;
        this.units = units;
    }

    public String getName() {
        return name;
    }

    public Set<String> getUnits() {
        return units;
    }
}
