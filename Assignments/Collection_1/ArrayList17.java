package Assignments.Collection_1;

import java.util.ArrayList;

// 17. Write a Java program to empty an array list.
public class ArrayList17 {
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
        //colors.removeAll(colors);
        colors.clear();
        System.out.println(colors);
    }
}
