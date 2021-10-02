package tech.codingclub;

import java.util.Scanner;

public class ExceptionExample {
    public static void main(String[] args) {
        int x = 100;
        Scanner scan = new Scanner(System.in);

        try {
            int y = scan.nextInt();
            int ans = x / y;
            System.out.println(ans);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            int arr[] = {1, 2, 3, 4};
            System.out.println(arr[100]);
        } catch (Exception e) {
            System.out.println("Caught !" + e.getClass());
        } finally {
            System.out.println("Inside Finally");
        }
        System.out.println("Hello Word");

    }
}
