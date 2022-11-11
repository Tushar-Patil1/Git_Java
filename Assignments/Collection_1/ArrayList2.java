package Assignments.Collection_1;

import java.util.ArrayList;
import java.util.Iterator;

//2. Write a Java program to iterate through all elements in an array list.
public class ArrayList2 {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");

        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
