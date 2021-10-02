package tech.codingclub;

import java.util.Date;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 3 running at" + new Date().toString() + "sharp");
        byte a = 1; //1byte
        short b = 3; //2byte
        int c = 5;   //4byte
        long d = 7;  //8byte

        boolean e = true; //false
        char f = 'a';    //2byte

        float g = 9.4f;
        double h = 11.0;
        System.out.println(a + ":" + b + ":" + c + ":" + d + ":" + e + ":" + f + ":" + g + ":" + h);
    }
}
