package day_07;

import java.util.Scanner;

public class M7 {

    public static void main(String[] args) {
        int[] a = new int[5];
        Scanner s = new Scanner(System.in);

        for(int i=0;i<a.length;i++){
            System.out.println("Enter element: ");
            a[i] = s.nextInt();
        }

        System.out.println("Array is : ");

        for(int i=0; i<a.length; i++){
            System.out.print(a[i]);
        }

        System.out.println(" End");
    }


}
