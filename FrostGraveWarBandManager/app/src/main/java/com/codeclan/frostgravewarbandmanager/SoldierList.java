package com.codeclan.frostgravewarbandmanager;


import android.app.usage.UsageEvents;

import java.util.ArrayList;

public class SoldierList {

    public ArrayList<Soldier> roster;

    public SoldierList() {
        roster = new ArrayList<Soldier>();
        roster.add(new Soldier("Archer", 50));
        roster.add(new Soldier("Knight", 100));
        roster.add(new Soldier("Infantryman", 50));
        roster.add(new Soldier("Thief", 20));
        roster.add(new Soldier("Man-at-Arms", 80));
        roster.add(new Soldier("Thug", 20));
        roster.add(new Soldier("Treasure Hunter", 80));
        roster.add(new Soldier("Barbarian", 100));
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

    public Soldier getSoldier(int i) {
        Soldier currentSoldier = roster.get(i);
        return currentSoldier;
    }
}
