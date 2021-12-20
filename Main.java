package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        //methodA();
        //System.out.println(methodB(10, 0));

        // Unchecked Exception - during runtime
        // Checked Exception  - compile time (before runtime)

        // try - catch :
        try{
            System.out.println( 10/ 0 );  /// throws ArithmeticException
        }catch (ArithmeticException exception){
            System.out.println("Arithmetic Exception has occurred");
        }
        System.out.println("rest of my code....");
        System.out.println("methods");
        System.out.println("product still running.....");


        int [] array = new int [5];  // 0  1  2  3  4
        try {
            System.out.println(array[6]);
        }catch (ArrayIndexOutOfBoundsException exception){
            System.out.println("Array Index Out Of Bounds Exception has occurred");
        }

        try {
            FileReader fileReader = new FileReader("C:\\Pro...");
        }catch (FileNotFoundException f){
            System.out.println("File not found");
        }
    }

    public static void methodA(){
        int [] array = new int [5];  // 0  1  2  3  4
        System.out.println(array[6]);
    }

    public static float methodB(float number1, float number2){
        return number1 / number2;
    }
}
