package Assignments.Collection_1;

import java.util.LinkedList;
// 22. Write a Java program to check if a particular element exists in a linked list
public class LinkedList22 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);

        if(linkedList.contains("Blue")){
            System.out.println("Exist");
        }else{
            System.out.println("Not exist");
        }
    }
}
