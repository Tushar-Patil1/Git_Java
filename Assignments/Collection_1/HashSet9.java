package Assignments.Collection_1;

import java.util.ArrayList;
import java.util.HashSet;

// 9. Write a Java program to convert a hash set to a List/ArrayList.
public class HashSet9 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);

        ArrayList<String> arrayList = new ArrayList<>(hashSet);
        System.out.println(arrayList);

    }
}
