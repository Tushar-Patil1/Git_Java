package Assignments.Collection_1;

import java.util.HashSet;

// 4. Write a Java program to empty a hash set.
public class HashSet4 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);
        hashSet.clear();
        System.out.println(hashSet);
    }
}
