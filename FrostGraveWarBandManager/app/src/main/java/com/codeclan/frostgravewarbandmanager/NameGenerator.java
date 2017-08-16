package com.codeclan.frostgravewarbandmanager;


import java.io.Serializable;

public class NameGenerator implements Serializable {

    public String[] names;

    public NameGenerator() {
        this.names = new String[20];
        this.names[0] = "Merek";
        this.names[1] = "Carac";
        this.names[2] = "Ulric";
        this.names[3] = "Tybalt";
        this.names[4] = "Borin";
        this.names[5] = "Sadon";
        this.names[6] = "Terrowin";
        this.names[7] = "Rowan";
        this.names[8] = "Forthwind";
        this.names[9] = "Althalos";
        this.names[10] = "Fendrel";
        this.names[11] = "Brom";
        this.names[12] = "Hadrian";
        this.names[13] = "Walter De Bolbec";
        this.names[14] = "Oliver Cromwell";
        this.names[15] = "Sir Clifton Writingham";
        this.names[16] = "Walter deGrey";
        this.names[17] = "Leofrick";
        this.names[18] = "John of Gaunt";
        this.names[19] = "Simon de Montfort";
    }
}

