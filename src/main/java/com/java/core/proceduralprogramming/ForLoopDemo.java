package com.java.core.proceduralprogramming;

public class ForLoopDemo {
    public static void main(String[] args) {
        // for(<INITIALIZE VARIABLE>; <CONDITION>; <INCREMENT / DECREMENT>){
        // .....
        // ..... REPEAT TILL CONDITION BECOMES FALSE
        // }
        for(int i=0; i<=100; i++) { // i = i+1 - SHORTHAND - i++
            System.out.println("Iterating for "+i+" number");
        }

//        for(int j=0; j<100; j+=2) { // j=j+2 SHORTHAND j+=2
//            System.out.println("Iterating with 2 as increment for "+j);
//        }

//        for(int i=100; i>=0; i--) {
//            System.out.println("Iterating backwards with "+i);
//        }

//        for(int k=0; true; k++) {
//            System.out.println("Iterating infinitely for "+k);
//        }
//        int answer = 1;
//        for(int k=0; true; k++) {
//            System.out.println("Who is prime minister of India");
//            System.out.println("1. Narendra Modi");
//            System.out.println("2. Lalit Modi");
//            if(answer == 2) {
//                continue;
//            }else {
//                break;
//            }
//        }
    }
}
