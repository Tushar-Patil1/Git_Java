package Assignments.Collection_1;

import java.util.LinkedList;

// 20. Write a Java program to retrieve but does not remove, the first element of a linked list.
public class LinkedList20 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        System.out.println(linkedList.peekFirst());

    }
}
