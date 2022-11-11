package Assignments.Collection_1;

import java.util.LinkedList;
// 8. Write a Java program to insert the specified element at the end of a linked list.
public class LinkedList8 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        linkedList.offerLast("Yellow");
        System.out.println(linkedList);

    }
}
