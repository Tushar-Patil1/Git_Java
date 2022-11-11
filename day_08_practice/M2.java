package day_08_practice;

public class M2 {

    int a=100; // call by reference

    void show(M2 m2){
        m2.a=m2.a+100;
        System.out.println(a);
    }

    public static void main(String[] args) {

        M2 m2 = new M2();
        System.out.println(m2.a);
        m2.show(m2);
        System.out.println(m2.a);
    }
}
