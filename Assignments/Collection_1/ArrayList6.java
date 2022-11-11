package Assignments.Collection_1;

import java.util.ArrayList;

//6. Write a Java program to remove the third element from an array list.
public class ArrayList6 {
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
        colors.remove(3);
        System.out.println(colors);
    }
}
