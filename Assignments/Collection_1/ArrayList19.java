package Assignments.Collection_1;

import java.util.ArrayList;

// 19. Write a Java program to trim the capacity of an array list the current list size.
public class ArrayList19 {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> arrayList = new ArrayList<>(50);
//        System.out.println("Size: "+ 0 +" Capacity: "+ findCapacity(arrayList));
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(50);
        System.out.println(arrayList);
//        System.out.println("Size: "+ arrayList.size()+" Capacity: "+ findCapacity(arrayList));
        arrayList.trimToSize();
        System.out.println(arrayList);
//        System.out.println("Size: "+ arrayList.size()+" Capacity: "+ findCapacity(arrayList));
    }

//    public static int findCapacity(ArrayList<Integer> arrayList) throws Exception{
//        Field field = ArrayList.class.getDeclaredField("elementData");
//        field.setAccessible(true);
//        return ((Object[]) field.get(arrayList)).length;
//    }


}
