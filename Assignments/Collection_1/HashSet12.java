package Assignments.Collection_1;

import java.util.HashSet;

// 12. Write a Java program to remove all of the elements from a hash set.
public class HashSet12 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println("First: "+hashSet);

        hashSet.remove(hashSet);
        System.out.println(hashSet);
    }
}
