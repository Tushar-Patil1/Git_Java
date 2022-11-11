package day_09;

import java.util.ArrayList;

public class M2 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(4);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(9);
        arrayList2.add(6);
        arrayList2.add(7);
        arrayList2.add(7);

        arrayList1.addAll(arrayList2);
        System.out.println(arrayList1);

    }
}
