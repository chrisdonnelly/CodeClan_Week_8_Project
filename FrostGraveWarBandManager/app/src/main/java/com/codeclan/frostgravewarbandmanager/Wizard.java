package com.codeclan.frostgravewarbandmanager;


import java.util.ArrayList;

public class Wizard {

    private String name;
    private String school;
    public ArrayList<Spell> spellBook;
    public int gold;

    public Wizard (String name, String school) {
        this.name = name;
        this.school = school;
        this.spellBook = new ArrayList<Spell>();
        this.gold = 500;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return this.school;
    }

    public int getGold() {
        return this.gold;
    }

    public String getSpellBook() {
        return this.spellBook.toString();
    }

    public Spell getSpell(int index) {
        return this.spellBook.get(index);
    }

    public int transact(int i) {
        return this.gold += i;
    }


}