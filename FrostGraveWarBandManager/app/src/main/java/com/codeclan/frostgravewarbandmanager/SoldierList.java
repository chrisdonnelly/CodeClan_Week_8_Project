package com.codeclan.frostgravewarbandmanager;


import java.util.ArrayList;

public class SoldierList {

    public ArrayList<Soldier> roster;

    public SoldierList() {
        roster = new ArrayList<Soldier>();
        roster.add(new Soldier("Archer", 50));
        roster.add(new Soldier("Knight", 100));
    }

    public ArrayList<Soldier> getRoster() {
        return new ArrayList<Soldier>(roster);
    }

    public String getSoldierName(int i) {
        Soldier currentSoldier = roster.get(i);
        return currentSoldier.getName();
    }

    public String getSoldierType(int i) {
        Soldier currentSoldier = roster.get(i);
        return  currentSoldier.getType();
    }

    public int getSoldierCost(int i) {
        Soldier currentSoldier = roster.get(i);
        return currentSoldier.getCost();
    }
}
