package Assignments.Collection_1;

import java.util.ArrayList;

// 18. Write a Java program to test if an array list is empty or not.
public class ArrayList18 {
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
        System.out.println(colors.isEmpty());
        System.out.println("**********");
        ArrayList<String> strings = new ArrayList<>();
        System.out.println(strings.isEmpty());
    }
}
