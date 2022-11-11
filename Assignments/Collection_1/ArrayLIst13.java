package Assignments.Collection_1;

import java.util.ArrayList;

//13. Write a Java program to compare two array lists.
public class ArrayLIst13 {
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

        ArrayList<String> color=new ArrayList<>();
        color.add("Violet");
        color.add("Indigo");
        color.add("Blue");
        color.add("Green");
        color.add("Yellow");
        color.add("Orange");
        color.add("Red");

        boolean b = colors.equals(color);
        System.out.println(b);

    }
}
