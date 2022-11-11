package Assignments.Collection_1;

import java.util.LinkedList;

//12. Write a Java program to remove a specified element from a linked list.
public class LinkedList12 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

    }
}
