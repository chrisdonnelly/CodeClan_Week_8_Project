package com.codeclan.frostgravewarbandmanager;

import java.util.ArrayList;

import static android.R.id.list;

public class WizardSchools {

    public ArrayList<School> schools;

    public WizardSchools() {
        schools = new ArrayList<School>();
        schools.add(new School("Chronomancer"));
        schools.add(new School("Elementalist"));
        schools.add(new School("Enchanter"));
        schools.add(new School("Illusionist"));
        schools.add(new School("Necromancer"));
        schools.add(new School("Sigilist"));
        schools.add(new School("Soothsayer"));
        schools.add(new School("Summoner"));
        schools.add(new School("Thaumaturge"));
        schools.add(new School("Witch"));
    }

    public ArrayList<School> getList() {
        return new ArrayList<School>(schools);
    }

    public String getName(int i) {
        School currentSchool = schools.get(i);
        return currentSchool.getSchoolName();
    }
}
