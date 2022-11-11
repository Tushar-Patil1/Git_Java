package Assignments.Collection_1;

import java.util.LinkedList;

// 19. Write a Java program to remove and return the first element of a linked list.
public class LinkedList19 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        System.out.println(linkedList.pop());
        System.out.println(linkedList);

    }
}
