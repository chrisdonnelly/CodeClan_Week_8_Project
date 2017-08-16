package com.codeclan.frostgravewarbandmanager;

public class Spell {

    private String spellName;
    private String school;

    public Spell(String spellName, String school) {
        this.spellName = spellName;
        this.school = school;
    }

    public String getSpellName() {
        return this.spellName;
    }

    public String getSchool() {
        return this.school;
    }
}
