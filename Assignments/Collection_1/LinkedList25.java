package Assignments.Collection_1;

import java.util.LinkedList;

// 25. Write a Java program to test whether a linked list is empty or not.
public class LinkedList25 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);

        System.out.println(linkedList.isEmpty());
    }
}
