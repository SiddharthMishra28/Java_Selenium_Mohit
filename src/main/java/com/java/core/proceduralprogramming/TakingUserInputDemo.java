package com.java.core.proceduralprogramming;

import java.util.Scanner;

public class TakingUserInputDemo {
    public static void main(String[] args) {
        int a;
        int b;
        int option;
        boolean isRunning = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO MY CALCULATOR:");
        while(isRunning) {
            System.out.println("Choose an option from below menu: ");
            System.out.println("1. Add two numbers");
            System.out.println("2. Subtract two numbers");
            System.out.println("3. Multiply two numbers");
            System.out.println("4. Divide two numbers");
            System.out.println("5. Turn off Calculator");
            option = sc.nextInt(); // USED FOR READING INTEGER VALUE FROM CONSOLE
            if(option == 1) {
                System.out.println("Enter 1st Number : ");
                a = sc.nextInt();
                System.out.println("Enter 2nd Number : ");
                b = sc.nextInt();
                System.out.println("Sum of "+a+" and "+b+" is : "+(a+b));
            }else if(option == 2) {
                System.out.println("Enter 1st Number : ");
                a = sc.nextInt();
                System.out.println("Enter 2nd Number : ");
                b = sc.nextInt();
                System.out.println("Difference of "+a+" and "+b+" is : "+(a-b));
            }else if(option == 3) {
                System.out.println("Enter 1st Number : ");
                a = sc.nextInt();
                System.out.println("Enter 2nd Number : ");
                b = sc.nextInt();
                System.out.println("Product of "+a+" and "+b+" is : "+(a*b));
            }else if(option == 4) {
                System.out.println("Enter 1st Number : ");
                a = sc.nextInt();
                System.out.println("Enter 2nd Number : ");
                b = sc.nextInt();
                System.out.println("Quotient of "+a+" and "+b+" is : "+(a/b));
            }else if(option == 5) {
                System.out.println("Bye!");
//                break;
                isRunning = false;
            }
            else {
                System.out.println("Invalid Menu option selected!");
            }
        }
    }
}
