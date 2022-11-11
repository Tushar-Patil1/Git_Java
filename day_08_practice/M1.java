package day_08_practice;

public class M1 {

    int a=100; // Call by value

    void show(int a){
        a=a+100;
        System.out.println(a);
    }

    public static void main(String[] args) {

        M1 m1 = new M1();
        System.out.println(m1.a);
        m1.show(100);
        System.out.println(m1.a);
    }
}
