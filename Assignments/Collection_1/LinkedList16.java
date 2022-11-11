package Assignments.Collection_1;

import java.util.Collections;
import java.util.LinkedList;
//16. Write a Java program to shuffle the elements in a linked list.
public class LinkedList16 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        Collections.shuffle(linkedList);
        System.out.println(linkedList);
    }
}
