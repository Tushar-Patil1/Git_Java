package day5;

class A13{

    int a=10;

    void show(){
        System.out.println("Parent calling");
        System.out.println(a);
    }

}

public class P13 extends A13 {

    int b;
    void display(){
        System.out.println("Child calling");
        System.out.println(b);
        System.out.println(a);
        System.out.println("");
    }

    public static void main(String[] args) {
        A13 a13 = new A13();
        a13.show();

        P13 p13 = new P13();
        p13.display();
        p13.show();
        p13.a=22;
        p13.b=23;
    }
}
