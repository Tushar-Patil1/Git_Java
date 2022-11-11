package Assignments.Collection_1;

import java.util.LinkedList;

// 24. Write a Java program to compare two linked lists.
public class LinkedList24 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("Yellow");
        linkedList1.add("White");
        System.out.println(linkedList1);

        System.out.println(linkedList.equals(linkedList1));

    }
}
