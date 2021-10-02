package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Stack Class running at" + new Date().toString() + "sharp");
        Stack<String> stack = new Stack<String>();
        Stack<Integer> integerStack = new Stack<Integer>();
        integerStack.push(2);
        integerStack.push(10);
        integerStack.push(15);
        integerStack.push(20);
        integerStack.push(5);
        integerStack.push(200);
        int topElement = integerStack.pop();
        System.out.println("Pop element" + topElement);
        System.out.println("Top of the Stack :" + integerStack.peek());
        int index = integerStack.search(5);
        int find200 = integerStack.search(200);
        System.out.println("Index of 5 is:" + index);
        System.out.println("Index of 200 is" + find200);
        System.out.println("#####################");
        Iterator<Integer> itr = integerStack.iterator();
        while (itr.hasNext()) {
            System.out.println("Iterator Showing element :" + itr.next());
        }
        System.out.println("#####################");
        while (!integerStack.empty()) {
            System.out.println("Popped:" + integerStack.pop());
        }

    }
}
