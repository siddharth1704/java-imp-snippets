package tech.codingclub;

import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;

public class Test8 {
    public static void main(String[] args) {
        System.out.println("This is Siddharth");
        System.out.println("Test 8 running at" + new Date().toString() + "sharp");
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("This");
        linkedList.add("is");
        linkedList.add("how");
        linkedList.add("you");
        linkedList.add("code");
        linkedList.add("linked list");
        System.out.println(linkedList.getFirst() + ":" + linkedList.getLast() + ":" + linkedList.size());
        Iterator<String> itr = linkedList.iterator();
        while (itr.hasNext()) {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
    }
}
