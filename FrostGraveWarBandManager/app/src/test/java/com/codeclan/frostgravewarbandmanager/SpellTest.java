package com.codeclan.frostgravewarbandmanager;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SpellTest {

    Spell spell;

    @Before
    public void before() {
        spell = new Spell("Enchant Weapon", "Enchanter");
    }

    @Test
    public void canGetName() {
        assertEquals("Enchant Weapon", spell.getSpellName());
    }

    @Test
    public void canGetSchool() {
        assertEquals("Enchanter", spell.getSchool());
    }
}
