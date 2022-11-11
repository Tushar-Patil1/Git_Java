package Assignments.Collection_1;

import java.util.HashSet;

// 11. Write a Java program to compare two sets and retain elements which are the same on both sets.
public class HashSet11 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println("First: "+hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Black");
        hashSet1.add("Blue");
        hashSet1.add("White");
        System.out.println("Second: "+hashSet1);

        hashSet.retainAll(hashSet1);
        System.out.println("Same element: "+hashSet);
    }
}
