package day_09;

import java.util.ArrayList;

public class M1 {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Tushar");
        arrayList.add("Yogita");
        arrayList.add("Suraj");
        arrayList.add("Sonali");

        System.out.println(arrayList);
        System.out.println(arrayList.size());
        arrayList.remove("Suraj");
        System.out.println(arrayList);
        System.out.println(arrayList.size());
    }

}
