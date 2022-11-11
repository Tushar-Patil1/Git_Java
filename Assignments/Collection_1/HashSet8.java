package Assignments.Collection_1;

import java.util.HashSet;
import java.util.TreeSet;

// 8. Write a Java program to convert a hash set to a tree set.
public class HashSet8 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);

        TreeSet<String>treeSet = new TreeSet<>(hashSet);
        System.out.println(treeSet);

    }
}
