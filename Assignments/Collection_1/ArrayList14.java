package Assignments.Collection_1;

import java.util.ArrayList;
import java.util.Collections;

// 14. Write a Java program of swap two elements in an array list.
public class ArrayList14 {

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
        Collections.swap(colors, 0, 3);
        System.out.println(colors);
    }

}
