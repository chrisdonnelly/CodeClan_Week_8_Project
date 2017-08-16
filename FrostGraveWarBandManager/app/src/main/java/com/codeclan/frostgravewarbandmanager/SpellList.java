package com.codeclan.frostgravewarbandmanager;


import java.util.ArrayList;

public class SpellList {

    public ArrayList<Spell> spells;

    public SpellList() {
        spells = new ArrayList<Spell>();
        spells.add(new Spell("Enchant Weapon","Chronomancer"));
        spells.add(new Spell("Teleport","Elementalist"));
    }

    public ArrayList<Spell> getList() {
        return new ArrayList<Spell>(spells);
    }

    public String getName(int i) {
        Spell currentSpell = spells.get(i);
        return currentSpell.getSpellName();
    }

    public String getSchool(int i) {
        Spell curenntSpell = spells.get(i);
        return curenntSpell.getSchool();
    }
}
