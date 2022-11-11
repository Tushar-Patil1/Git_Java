package Assignments.Collection_1;

import java.util.LinkedList;

// 1. Write a Java program to append the specified element to the end of a linked list.
public class LinkedList1 {

    public static void main(String[] args) {

        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        System.out.println(linkedList);
        linkedList.offerLast("Black");
        System.out.println(linkedList);

    }
}
