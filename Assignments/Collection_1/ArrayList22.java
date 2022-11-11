package Assignments.Collection_1;

import java.util.ArrayList;

//22. Write a Java program to print all the elements of an ArrayList using the position of the elements.
public class ArrayList22 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>();
        colors.add("Violet");
        colors.add("Indigo");
        colors.add("Blue");
        colors.add("Green");

        System.out.println(colors);
        for(int i=0; i< colors.size(); i++){
            System.out.println(colors.get(i));
        }

        System.out.println("**********");

        for(String c: colors){
            System.out.println(c);
        }
    }
}
