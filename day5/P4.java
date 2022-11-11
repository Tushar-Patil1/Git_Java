package day5;

class A4 {
    int a;
    int b;
    static int c;

    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

public class P4 {
    public static void main(String[] args) {
        A4 a4 = new A4();
        a4.show();
        System.out.println("*******");
        A4 a41 = new A4();
        A4.c=50;
        a41.show();
        System.out.println("********");
        a4.show();
    }
}
