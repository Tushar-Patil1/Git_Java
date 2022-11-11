package Assignments.Collection_1;

import java.util.HashSet;
// 6. Write a Java program to clone a hash set to another hash set.
public class HashSet6 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);

        HashSet<String>hashSet1 = (HashSet<String>) hashSet.clone();
        System.out.println(hashSet1);
    }
}
