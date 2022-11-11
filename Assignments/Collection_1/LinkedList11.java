package Assignments.Collection_1;

import java.util.LinkedList;
// 11. Write a Java program to display the elements and their positions in a linked list.
public class LinkedList11 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);
        for(int i=0;i< linkedList.size();i++){
            System.out.println("Index: "+i+" Value "+linkedList.get(i));
        }
    }
}
