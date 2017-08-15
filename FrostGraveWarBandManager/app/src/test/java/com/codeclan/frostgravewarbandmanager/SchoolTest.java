package com.codeclan.frostgravewarbandmanager;


import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class SchoolTest {

    School school;

    @Before
    public void before() {
        school = new School("Enchanter");
    }

    @Test
    public void canGetName() {
        assertEquals("Enchanter", school.getSchoolName());
    }
}
