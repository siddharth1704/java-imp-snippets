import java.util.Scanner;

public abstract class TestString {
    String str;
    void inputString(){
        Scanner scan =new Scanner(System.in);
        System.out.println("Input the string");
        str= scan.nextLine();
    }
    abstract void palindrome();
    abstract void show();
}
