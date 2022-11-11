package Assignments.Collection_1;

import java.util.LinkedList;

// 6. Write a Java program to insert elements into the linked list at the first and last position.
public class LinkedList6 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        linkedList.addFirst("Yellow");
        linkedList.addLast("White");
        System.out.println(linkedList);
    }
}
