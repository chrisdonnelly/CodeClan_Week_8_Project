package com.codeclan.frostgravewarbandmanager;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SoldierListTest {

    SoldierList soldierList;

    @Before
    public void before() {
        soldierList = new SoldierList();
    }

    @Test
    public void canGetList() {
        assertEquals(2, soldierList.getRoster().size());
    }

    @Test
    public void canGetSoldier() {
        soldierList.getRoster();
        assertEquals("Archer", soldierList.getSoldier(0).getType());
    }

}
