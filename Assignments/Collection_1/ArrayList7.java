package Assignments.Collection_1;

import java.util.ArrayList;

//7. Write a Java program to search an element in an array list.
public class ArrayList7 {
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

        if(colors.contains("Blue")){
            System.out.println("Exist");
        }else{
            System.out.println("Not exist");
        }
    }
}
