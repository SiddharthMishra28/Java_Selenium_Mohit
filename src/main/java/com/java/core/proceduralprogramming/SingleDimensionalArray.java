package com.java.core.proceduralprogramming;

public class SingleDimensionalArray {
    public static void main(String[] args) {
        // DATA_TYPE[] VARIABLE_NAME = new DATA_TYPE[SIZE]
        // HOMOGENEOUS
        int[] myNumbers = new int[5]; // myNumbers variable can hold 5 Integer elements
        // ARRAY INDEX ALWAYS STARTS FROM 0
        myNumbers[0] = 10;
        myNumbers[1] = 12;
        myNumbers[2] = 13;
        myNumbers[3] = 30;
        myNumbers[4] = 5;
//        myNumbers[5] = 34; // ARRAY INDEX OUT OF BOUNDS
//        System.out.println(myNumbers[4]);

        // DATA_TYPE[] VARIABLE_NAME = {....Elements};
        String[] students = {"sid", "mohit", "shankar", "steve"};
        // LENGTH PROPERTY IS DYNAMICALLY ASSIGNED
//        System.out.println(students.length);
//        System.out.println(students[2]);

        // ITERATING OVER ARRAY
        for(int i=0; i<myNumbers.length; i++) {
            System.out.println(myNumbers[i]);
        }

        for(int j=0; j<students.length; j++){
            System.out.println(students[j]);
        }
    }
}
