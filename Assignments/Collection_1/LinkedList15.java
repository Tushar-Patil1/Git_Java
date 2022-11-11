package Assignments.Collection_1;

import java.util.Collections;
import java.util.LinkedList;
// 15. Write a Java program of swap two elements in a linked list.
public class LinkedList15 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        Collections.swap(linkedList, 1,3);
        System.out.println(linkedList);
    }
}
