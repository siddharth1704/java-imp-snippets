package tech.codingclub;

import java.util.Date;
import java.util.Random;

public class Test6 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 6 running at" + new Date().toString() + "sharp");
        Random ran = new Random();
        int c = ran.nextInt(100);
        System.out.println("Random number from 0 to 99 is  " + c);
        c = 50 + ran.nextInt(50);
        System.out.println("Random number from 50 to 99 is " + c);
        String s = "HelloWorld";
        System.out.println("Printing String :" + s);
        s += "!";
        System.out.println("Printing Modified string :" + s);
        System.out.println("Current Length: " + s.length());
        System.out.println("Substring(5,end): " + s.substring(5));
        System.out.println("Substring(5,6): " + s.substring(5, 7));
        System.out.println("UC :" + s.toUpperCase());
        System.out.println("LC :" + s.toLowerCase());
        int h = s.indexOf('W');
        System.out.println("Index of W :" + h);
        char g = s.charAt(6);
        System.out.println("Char at 6th index :" + g);
        String s1 = "abc";
        String s2 = "abd";
        System.out.println(s1.compareTo(s2));
        Date date = new Date();
        long prevTime = date.getTime();
        for (int i = 0; i < 10000000; i++) {
        }
        long currTime = date.getTime();
        System.out.println(currTime - prevTime + " milliseconds to run 10^6 on my machine");
    }
}
