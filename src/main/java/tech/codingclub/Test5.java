package tech.codingclub;

import java.util.Date;

public class Test5 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 5 running at" + new Date().toString() + "sharp");
        int a = 10, b = 20;
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
        double c = 20.5;
        System.out.println("Math.abs(): " + Math.abs(c));
        System.out.println("Math.ceil(): " + Math.ceil(a));
        System.out.println("Math.floor(): " + Math.floor(c));
        System.out.println("Math.min(): " + Math.min(a, b));
        System.out.println("Math.max(): " + Math.max(a, b));
        System.out.println("Math.random(): " + Math.random());
        System.out.println("Math.random(): " + (10 + (int) Math.random() * 90));
        System.out.println("Math.pow()" + Math.pow(2, 3));
        int e = 100;
        System.out.println("Post increment" + e++);
        System.out.println("Pre Increment" + ++e);
        int i = 1;
        int ans = 1;
        while (i <= 5) {
            ans *= i;
            i++;
        }
        System.out.println("5! using while loop      " + ans);
    }
}
