package Assignments.Collection_1;

import java.util.ArrayList;

// 4. Write a Java program to retrieve an element (at a specified index) from a given array list.

public class ArrayList4 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);

        Integer element = arrayList.get(2);
        System.out.println("element at index 2 is "+element);

    }
}
