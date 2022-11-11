package Assignments.Collection_1;

import java.util.LinkedList;
// 17. Write a Java program to join two linked lists.
public class LinkedList17 {
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

        linkedList.addAll(linkedList1);
        System.out.println(linkedList);
    }
}
