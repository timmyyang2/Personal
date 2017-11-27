package com.java24hours.h10;

public class Blocker extends FootballPlayer {
    public void block(FootballPlayer p) {
        System.out.println("#" + this.number
            + " blocks " + "#" + p.number);
        }
}

