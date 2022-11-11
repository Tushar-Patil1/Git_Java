package Assignments.Collection_1;

import java.util.HashSet;

// 1. Write a Java program to append the specified element to the end of a hash set.
public class HashSet1 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);
    }
}
