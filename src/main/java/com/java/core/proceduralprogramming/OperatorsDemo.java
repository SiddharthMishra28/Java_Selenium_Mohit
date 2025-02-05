package com.java.core.proceduralprogramming;

public class OperatorsDemo {
//    public static void main(String[] args) {
//        // Arithmetic Operators - (+, - , *, /, %(modulus/ remainder))
//        // Logical Operators - (&& (AND), || (OR), !(NOT))
//        // Ternary Operators - SHORTHAND OPERATOR - SIMPLE LOGIC
//        // Shift Operators - << (left shift), >> (right shift) 0010, 1000 - EMBEDDED SYSTEMS
//        char operator = '*';
//        int num1 = 5;
//        int num2 = 12;
//        if(operator == '+'){
//            System.out.println("Sum is : "+(num1 + num2)); // CONCATENATION
//        }else if(operator == '-'){
//            System.out.println("Difference is : "+(num1 - num2));
//        }else if(operator == '*') {
//            System.out.println("Product is : "+(num1 * num2));
//        }else {
//            System.out.println("Quotient is : "+(num1 / num2));
//        }
//    }

    public static void main(String[] args) {
        // | VAL1 | VAL2 |         RESULT
        // | true | true | AND    | true
        // | true | false | AND   | false
        // | false | false | AND  | false
        // | true | false | OR    | true
        // | false | false | OR   | false
        String country = "India";
        int age = 23;
//        if(<CONDITION1> && <CONDITION2>){
//            sout(true)
//        }
        if(country == "India" && age > 18) {
            System.out.println("Elligible to Vote");
        }else {
            System.out.println("Not Elligible to Vote");
        }
    }
}
