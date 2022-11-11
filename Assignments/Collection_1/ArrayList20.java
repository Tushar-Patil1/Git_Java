package Assignments.Collection_1;

import java.util.ArrayList;

public class ArrayList20 {
    public static void main(String[] args) {
        ArrayList<String> color= new ArrayList<String>(3);
        color.add("Red");
        color.add("Green");
        color.add("Black");
        color.add("Pink");
        System.out.println("Original array list- " + color);

        color.ensureCapacity(6);
        color.add("White");
        color.add("Blue");
        color.add("Yellow");
        System.out.println("New array list- " + color);
    }
}
