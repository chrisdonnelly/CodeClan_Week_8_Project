package com.codeclan.frostgravewarbandmanager;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class WizardSchoolsTest {

    WizardSchools schools;

    @Before
    public void before() {
        schools = new WizardSchools();
    }

    @Test
    public void canGetList() {
        assertEquals(10, schools.getList().size());
    }

    @Test
    public void canGetSchoolNamefromList() {
        schools.getList();
        assertEquals("Chronomancer", schools.getName(0));
    }
}
