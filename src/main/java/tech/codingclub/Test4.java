package tech.codingclub;

import java.util.Date;
import java.util.Scanner;

public class Test4 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 4 running at" + new Date().toString() + "sharp");
        int arr[] = {10, 20, 30, 40};
        System.out.println("Last element is  " + arr[arr.length - 1]);
        int arr2[][] = {{1, 2, 3}, {4, 5, 6}};
        System.out.println("Last row Last column is: " + arr2[1][2]);
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = scan.nextInt();
        System.out.println("Enter b: ");
        int b = scan.nextInt();
        System.out.println("Sum is: " + (a + b));
        String s = scan.next();
        System.out.println("String is:" + s);
    }
}
