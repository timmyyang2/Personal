package com.java24hours.h10;

class Lineman extends Blocker {
    public void hold(FootballPlayer p) {
        System.out.println("#" + this.number
            + " holds " + p.number);
    }
}
