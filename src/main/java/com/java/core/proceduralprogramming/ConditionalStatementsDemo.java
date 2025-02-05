package com.java.core.proceduralprogramming;

public class ConditionalStatementsDemo {
//    public static void main(String[] args) {
//        String adhaar = "2343567809104";
//        // if, else, else if
//        // if(<CONDITION>){
//        // ..... executed only if <CONDITION> is true
//        // .....
//        // }
//        if(adhaar.length() == 12){
//            System.out.println("Valid Adhaar number");
//        }else {
//            System.out.println("Invalid Adhaar number");
//        }
//    }
    public static void main(String[] args) {
        String country = "Ukraine";
        int age = 19;
        if(country == "India"){ // NESTED IF STATEMENTS
            if(age > 18) {
                System.out.println("Elligible to Vote!");
            }else {
                System.out.println("Not Elligible to Vote!");
            }
        }else if(country == "Kazakhsthan") {
            if(age > 23) {
                System.out.println("Elligble to Vote!");
            }else {
                System.out.println("Not Elligible to Vote!");
            }
        }else {
            System.out.println("Please check country specific requirement");
        }
    }

}
