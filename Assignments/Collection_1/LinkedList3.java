package Assignments.Collection_1;

import java.util.Iterator;
import java.util.LinkedList;

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
public class LinkedList3 {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Violet");
        linkedList.add("Indigo");
        linkedList.add("Blue");
        linkedList.add("Black");
        System.out.println(linkedList);

        Iterator<String> i = linkedList.listIterator(2);
        while (i.hasNext()){
            System.out.println(i.next());
        }
        System.out.println("**********");
        for(int j=2;j< linkedList.size();j++){
            System.out.println(linkedList.get(j));
        }

    }
}
