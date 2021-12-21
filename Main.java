package com.company;

public class Main {

        // Create an array size 10
        // print array index -1   -> arrAY[-1]
        // you need to find out what exception it rises.
       // handle the exception so the program not broke.

        // try to make an array with -1 size. - > new int [-1]
        // if it is not working try to handle that.

    public static void main(String[] args) {
        //1:
          int arr [] = new int[10];
           // System.out.println(arr[-1]);
            try {
                for (int i = -1; i < arr.length; i++) {
                    System.out.println(arr[i]);
                }
            }
            catch (ArrayIndexOutOfBoundsException ex){
                System.out.println(ex.getMessage());
            }

        //2:
        try {
            int arr2[] = new int[-1];
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());

            ex.getStackTrace();

            Object [] objeArray = ex.getStackTrace();
            for(Object o: objeArray){
                System.out.println(o);
            }
        }
        System.out.println("Hello");
        try {
            Thread.sleep(10000);
        }
        catch (InterruptedException ex){

        }
        System.out.println("Hello After Sleep for 10 sec(:");
    }

}
