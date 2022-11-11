package Assignments.Collection_1;

import java.util.HashSet;
// 5. Write a Java program to test if a hash set is empty or not.
public class HashSet5 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);
        System.out.println(hashSet.isEmpty());
    }
}
