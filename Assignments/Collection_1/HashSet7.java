package Assignments.Collection_1;

import java.util.Arrays;
import java.util.HashSet;

// 7. Write a Java program to convert a hash set to an array.
public class HashSet7 {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Black");
        hashSet.add("Blue");
        hashSet.add("Pink");
        hashSet.add("Red");
        System.out.println(hashSet);
        System.out.println(Arrays.toString(hashSet.toArray()));

        String arr[] = new String[hashSet.size()];
        hashSet.toArray(arr);
        for(String s:arr){
            System.out.println(s);
        }
    }
}
