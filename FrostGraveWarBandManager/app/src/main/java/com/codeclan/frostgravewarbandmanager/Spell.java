package com.codeclan.frostgravewarbandmanager;

public class Spell {

    private String name;
    private String school;

    public Spell(String name, String school) {
        this.name = name;
        this.school = school;
    }

    public String getName() {
        return this.name;
    }

    public String getSchool() {
        return this.school;
    }
}
