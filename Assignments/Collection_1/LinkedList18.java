package Assignments.Collection_1;

import java.util.LinkedList;
// 18. Write a Java program to clone an linked list to another linked list.
public class LinkedList18 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);

        LinkedList<String>linkedList1= (LinkedList<String>) linkedList.clone();
        System.out.println(linkedList1);
    }
}
