package Assignments.Java_Basic_Assignment;
// Write a program in Java to display the pattern like right angle triangle with a number.

public class Q_4 {
    public static void main(String[] args) {
        for(int i=1;i<12;i++){
            for(int j=1;j<i;j++){
                System.out.print(j);
            }
            System.out.println(" ");
        }
    }
}
