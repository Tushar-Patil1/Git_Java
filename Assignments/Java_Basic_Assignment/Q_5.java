package Assignments.Java_Basic_Assignment;

import java.util.Scanner;

public class Q_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input number of rows: ");
        int a = sc.nextInt();
        int num = 1;
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println(" ");
        }
    }
}
