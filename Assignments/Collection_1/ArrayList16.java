package Assignments.Collection_1;

import java.util.ArrayList;

public class ArrayList16 {
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
        ArrayList arrayList = (ArrayList) colors.clone();
        System.out.println(arrayList);
    }
}
