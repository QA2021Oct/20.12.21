package com.company;

public class SpiderMan implements SuperHero{
    private int cobwebs;

    public SpiderMan(int cobwebs) {
        this.cobwebs = cobwebs;
    }

    @Override
    public String superPower() {
        return "SpiderMan has cobwebs: "  + cobwebs ;
    }

    @Override
    public boolean checkIfThereIsPowerLeft() {
        return true;
    }

    @Override
    public void fight() {
        System.out.println("SpiderMan fight now");
    }
}
