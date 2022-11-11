package Assignments.Collection_1;

import java.util.ArrayList;

//9. Write a Java program to copy one array list into another.
public class ArrayList9 {
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

        ArrayList<String> arrayList = colors;
        System.out.println(arrayList);
    }
}
