package com.codeclan.frostgravewarbandmanager;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

public class SoldierTest {

    Soldier soldier;

    @Before
    public void before() {
        soldier = new Soldier("Thug", 50);
    }

    @Test
    public void canGetName(){
        assertNotNull(soldier.getName());
    }

    @Test
    public void canChangeName(){
        soldier.setName("Steve");
        assertEquals("Steve", soldier.getName());
    }

    @Test
    public void canGetCost() {
        assertEquals(50, soldier.getCost());
    }
}
