package com.company;

public class SuperMan implements SuperHero{
        private boolean fly;
        private float xRayVision;
        private boolean arrayOfPower[] = new boolean[5];
       // private boolean arrayOfPower[] = {true, true.....}
        private int countFights = 0;

    public SuperMan(boolean fly, float xRayVision) {
        this.fly = fly;
        this.xRayVision = xRayVision;
    /*    for(int i =0; i < arrayOfPower.length; i++){
            arrayOfPower[i] = true;
        }*/
        for(boolean value: arrayOfPower){
            value = true;
        }

    }

    public String superPower(){
        return "super man can: fly, and has xRayVision: "  + xRayVision ;
    }

    public boolean checkIfThereIsPowerLeft(){ // is there is - true, if there is not - false!
        for(boolean element : arrayOfPower){
           if (element == true){
               return true;
           }
        }
        return false;
    }

    public void fight(){   /// false  false  false  false  false   __
        if(countFights < arrayOfPower.length) {
            arrayOfPower[countFights] = false;
            countFights++;  // counter 4
            System.out.println("super man fight num: " + countFights);
        }
        else {
            System.out.println("Super man died already he can't fight");
        }
    }
}
// Array { 1, 2, 3, 4 }
