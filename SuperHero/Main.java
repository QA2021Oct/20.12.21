package com.company;

public class Main {


    public static void main(String[] args) {
       SpiderMan PeterParker = new SpiderMan(8);
       PeterParker.fight();
       System.out.println("Is there power left? " + PeterParker.checkIfThereIsPowerLeft());
        System.out.println(PeterParker.superPower());

        System.out.println("===========================");
        SuperMan ClarkKent = new SuperMan(true,6.345f);

        System.out.println("Is there power left? " + ClarkKent.checkIfThereIsPowerLeft());
        System.out.println(ClarkKent.superPower());
        ClarkKent.fight();
        ClarkKent.fight();
        ClarkKent.fight();
        ClarkKent.fight();
        ClarkKent.fight();
        ClarkKent.fight();

        SuperMan ClarkKent2 = new SuperMan(true,6.345f);
    }
}
