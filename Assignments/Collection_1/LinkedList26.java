package Assignments.Collection_1;

import java.util.LinkedList;

// 26. Write a Java program to replace an element in a linked list.
public class LinkedList26 {
    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        String name = "White";
        linkedList.set(3,name);
        System.out.println(linkedList);
    }
}
