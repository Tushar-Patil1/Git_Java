package day_08_practice;

import java.util.Scanner;

public class M4 {

    public static void main(String[] args) {

        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        for(int i=0;i<5;i++){
            System.out.println("Enter element: ");
            int ip=scanner.nextInt();
            a[i] = ip;
        }

        for(int c:a){ // for-each loop
            System.out.print(c+" ");
        }

        System.out.println("*************");

    }






}
