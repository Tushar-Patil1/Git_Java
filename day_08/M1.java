package day_08;

// Auto-Boxing

public class M1 {
    public static void main(String[] args) {
        int a =10;
        Integer integer = 50;
        Integer integer1 = Integer.valueOf(a);
        Integer integer2=10;
        System.out.println(a);
        System.out.println(integer);

        integer=a; // Auto-Boxing
        System.out.println(integer);
    }
}
