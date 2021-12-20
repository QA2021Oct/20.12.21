package com.company;

public class IronMan implements SuperHero{

    private boolean armor;

    public IronMan(boolean armor) {
        this.armor = armor;
    }

    @Override
    public String superPower() {
        return "IronMan has Armor: "  + armor ;
    }

    @Override
    public boolean checkIfThereIsPowerLeft() {
        return true;
    }

    @Override
    public void fight() {
        System.out.println("IronMan fight now");
    }
}

// boolean[5]   _  _  _  _  (true/false)  -> false false false false false
