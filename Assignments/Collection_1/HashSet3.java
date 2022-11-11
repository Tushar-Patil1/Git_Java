package Assignments.Collection_1;

import java.util.HashSet;

// 3. Write a Java program to get the number of elements in a hash set.
public class HashSet3 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}
