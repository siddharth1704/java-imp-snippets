package tech.codingclub;

import java.util.ArrayList;
import java.util.Date;

public class Test7 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 7 running at" + new Date().toString() + "sharp");
        ArrayList<String> arrayList = new ArrayList();
        //add items
        arrayList.add("Welcome");
        arrayList.add("to");
        arrayList.add("the");
        arrayList.add("Java");
        arrayList.add("Code");
        arrayList.add("RemoveMe");
        //0 indexed
        String first = arrayList.get(0);
        System.out.println("First One: " + first);
        //updated at index 2
        arrayList.set(2, "THE");
        //size
        int size = arrayList.size();
        //Last element remove
        arrayList.remove(size - 1);
        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }
        //Deletes the whole list
        arrayList.clear();
        System.out.println("Size after clearing: " + arrayList.size());

    }
}
