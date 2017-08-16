package com.codeclan.frostgravewarbandmanager;


import java.util.ArrayList;

public class SoldierList {

    public ArrayList<Soldier> soldiers;

    public SoldierList() {
        soldiers = new ArrayList<Soldier>();
        soldiers.add(new Soldier("Archer", 50));
        soldiers.add(new Soldier("Knight", 100));
    }

    public ArrayList<Soldier> getSoldiers() {
        return new ArrayList<Soldier>(soldiers);
    }

    public String getSoldierName(int i) {
        Soldier currentSoldier = soldiers.get(i);
        return currentSoldier.getName();
    }

    public String getSoldierType(int i) {
        Soldier currentSoldier = soldiers.get(i);
        return  currentSoldier.getType();
    }

    public int getSoldierCost(int i) {
        Soldier curenntSoldier = soldiers.get(i);
        return curenntSoldier.getCost();
    }
}
