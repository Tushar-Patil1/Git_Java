package Assignments.Collection_1;

import java.util.HashSet;

//2. Write a Java program to iterate through all elements in a hash list.
public class HashSet2 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);
        for(String s:hashSet){
            System.out.println(s);
        }
    }
}
