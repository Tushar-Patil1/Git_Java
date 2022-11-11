package Assignments.Collection_1;

import java.util.ArrayList;
import java.util.LinkedList;
//23. Write a Java program to convert a linked list to array list.
public class LinkedList23 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        ArrayList<String> arrayList = new ArrayList<>(linkedList);
        System.out.println(arrayList);
    }
}
