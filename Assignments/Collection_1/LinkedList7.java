package Assignments.Collection_1;

import java.util.LinkedList;

// 7. Write a Java program to insert the specified element at the front of a linked list.
public class LinkedList7 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        linkedList.offerFirst("Yellow");
        System.out.println(linkedList);
    }
}
