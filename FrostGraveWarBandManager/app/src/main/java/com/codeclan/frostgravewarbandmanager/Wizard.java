package com.codeclan.frostgravewarbandmanager;


import android.content.Intent;

import java.io.Serializable;
import java.util.ArrayList;

public class Wizard implements Serializable {

    private String name;
    private String school;
    public ArrayList<Spell> spellBook;
    public int gold;
    public ArrayList<Soldier> soldiers;

    public Wizard (String name, String school) {
        this.name = name;
        this.school = school;
        this.spellBook = new ArrayList<Spell>();
        this.gold = 500;
        this.soldiers = new ArrayList<Soldier>();
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

    public void addSpell(Spell spell) {
        this.spellBook.add(spell);
    }

    public int transact(int i) {
        return this.gold -= i;
    }

    public void addSoldier(Soldier soldier) {
        this.soldiers.add(soldier);
    }


}
