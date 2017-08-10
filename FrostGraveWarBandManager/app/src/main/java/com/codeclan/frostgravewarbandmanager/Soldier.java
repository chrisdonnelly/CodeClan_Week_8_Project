package com.codeclan.frostgravewarbandmanager;


public class Soldier {

    private String name;
    private String type;
    private int cost;

    public Soldier(String name, String type, int cost) {
        this.name = name;
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return this.cost;
    }
}