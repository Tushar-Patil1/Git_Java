package Assignments.Collection_1;

import java.util.LinkedList;
// 21. Write a Java program to retrieve but does not remove, the last element of a linked list.
public class LinkedList21 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        System.out.println(linkedList.peekLast());
    }
}
