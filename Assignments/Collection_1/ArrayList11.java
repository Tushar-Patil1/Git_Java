package Assignments.Collection_1;

import java.util.ArrayList;
import java.util.Collections;

//11. Write a Java program to reverse elements in an array list.
public class ArrayList11 {
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
        Collections.reverse(colors);
        System.out.println(colors);
    }
}
