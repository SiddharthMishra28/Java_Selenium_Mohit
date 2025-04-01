package com.java.core.proceduralprogramming.app;

import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        String toEncrypt = null;
        Scanner sc = new Scanner(System.in);
        boolean isRunning = true;
        while(isRunning) {
            System.out.println("Please select an option from below menu: ");
            System.out.println("1. Encrypt a String");
            System.out.println("2. Decrypt a String");
            System.out.println("3. Quit Program");
            int option = sc.nextInt();
            if(option == 1) {
                sc.nextLine(); // ALWAYS REQUIRED AFTER NEXTINT() TO CONSUME \n CHARACTER
                System.out.println("Enter string to encrypt : ");
                toEncrypt = sc.nextLine();
                char[] characters = toEncrypt.toCharArray();
                for(int i=0; i<characters.length; i++) {
                    int ascii_value = (int)characters[i]; // type casting
                    int ascii_shifted = ascii_value + 1;
                    System.out.print((char)ascii_shifted);
                }
                System.out.println();
            }else if(option == 2) {
                toEncrypt = sc.nextLine();
                // WRITE LOGIC HERE
            }else if(option == 3) {
                isRunning = false;
                System.out.println("Bye..");
            }
        }
    }
}
