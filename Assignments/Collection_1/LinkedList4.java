package Assignments.Collection_1;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

//4. Write a Java program to iterate a linked list in reverse order.
public class LinkedList4 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        Collections.reverse(linkedList);
        System.out.println(linkedList);

        Iterator<String> iterator = linkedList.descendingIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
