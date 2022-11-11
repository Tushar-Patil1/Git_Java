package day_09;

import java.util.ArrayList;
import java.util.HashSet;

public class M3 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(3);
        arrayList.add(3);
        System.out.println(arrayList); // Arraylis allow duplicate and insertion order is followed
        System.out.println("***********");

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(1);
        hashSet.add(2);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(5);
        hashSet.add(3);
        System.out.println(hashSet); // It doesn't follow insertion order..and doesn't allow duplicate value
        System.out.println("*******");

        arrayList.addAll(hashSet);
        System.out.println(arrayList);

    }
}
