package Assignments.Collection_1;

import java.util.ArrayList;

// 21. Write a Java program to replace the second element of an ArrayList with the specified element.
public class ArrayList21 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);

        String c = "Black";

        colors.set(1,c);
        System.out.println(colors);
    }
}