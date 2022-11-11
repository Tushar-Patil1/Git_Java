package Assignments.Collection_1;

import java.util.LinkedList;

// 14. Write a Java program to remove all the elements from a linked list.
public class LinkedList14 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        linkedList.removeAll(linkedList);
        System.out.println(linkedList);
    }
}
