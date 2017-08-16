package com.codeclan.frostgravewarbandmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WizardTest {

    Wizard wizard;
    Spell spell;
    Soldier soldier;

    @Before
    public void before() {
        wizard = new Wizard("Marlin the Magfishan", "Chronomancer");
        spell = new Spell("Enchant Weapon", "Enchanter");
        soldier = new Soldier("Crossbowman", -50);
    }

    @Test
    public void canGetName() {
        assertEquals("Marlin the Magfishan", wizard.getName());
    }

    @Test
    public void canChangeName(){
        wizard.setName("Steve");
        assertEquals("Steve", wizard.getName());
    }

    @Test
    public void canGetSchool() {
        assertEquals("Chronomancer", wizard.getSchool());
    }

    @Test
    public void canGetGold() {
        assertEquals(500, wizard.getGold());
    }

    @Test
    public void canSpendGold() {
        wizard.transact(100);
        assertEquals(400, wizard.getGold());
    }

    @Test
    public void canGetSpellBook() {
        assertEquals("[]", wizard.getSpellBook());
    }

    @Test
    public void canAddSpellToSpellBook() {
        wizard.spellBook.add(spell);
        assertEquals(spell, wizard.getSpell(0));
    }

    @Test
    public void canRemoveSpellFromSpellBook() {
        wizard.spellBook.remove(spell);
        assertEquals(0, wizard.spellBook.size());
    }

    @Test
    public void canAddSoldierToRoster () {
        wizard.addSoldier(soldier);
        assertEquals(1, wizard.soldiers.size());
    }
}