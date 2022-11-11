package Assignments.Collection_1;

import java.util.ArrayList;
import java.util.Collections;

//8. Write a Java program to sort a given array list.
public class ArrayList8 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Orange");
        colors.add("Red");

        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);
    }
}
