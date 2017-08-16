package com.codeclan.frostgravewarbandmanager;


import java.util.Random;

public class Soldier {

    public String name;
    public String type;
    public int cost;
    private NameGenerator nameGenerator;
    private Random generator;

    public Soldier(String type, int cost) {
        nameGenerator = new NameGenerator();
        generator = new Random();
        int randomIndex = generator.nextInt(nameGenerator.names.length);
        this.name = nameGenerator.names[randomIndex];
        this.type = type;
        this.cost = cost;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public int getCost() {
        return this.cost;
    }
}