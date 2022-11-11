package Assignments.Collection_1;

import java.util.HashSet;

// 10. Write a Java program to compare two hash sets.
public class HashSet10 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);

        HashSet<String> hashSet1 = new HashSet<>();
        hashSet1.add("Black");
        hashSet1.add("Blue");
        hashSet1.add("Pink");
        hashSet1.add("Red");
        System.out.println(hashSet1);

        System.out.println(hashSet.equals(hashSet1));
    }
}
