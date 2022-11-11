package Assignments.Collection_1;

import java.util.ArrayList;

// 1. Write a Java program to create a new array list, add some colors (string) and print out the collection

public class ArrayList1 {
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
    }

}
