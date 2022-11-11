package Assignments.Collection_1;

import java.util.LinkedList;

// 10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
public class LinkedList10 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        System.out.println("First element: "+linkedList.getFirst());
        System.out.println("Last element: "+linkedList.getLast());
    }
}
