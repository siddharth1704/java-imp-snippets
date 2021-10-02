package tech.codingclub;

import java.util.Date;

public class Test2 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 2 running at" + new Date().toString() + "sharp");
        int a = 400;
        int b = 8;
        System.out.println("Sum " + a + b);
        double w = a;
        System.out.println("Widened " + w);
        w += 0.1;
        System.out.println("Modified " + w);
        int n = (int) w;
        System.out.println("Narrowed " + n);
        int o = Integer.MAX_VALUE;
        System.out.println("MAX VALUE of int " + o);
        o += 4;
        System.out.println("Overflowed value" + o);
    }
}
