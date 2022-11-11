package day06;

class A3{
    public static void show(int x){
        System.out.println("A3 void");
    }

}
// Can we override static methods? -> Nooo
class B3 extends A3{
    public static void show(int x){
        System.out.println("B3 void ");
    }
}

public class Main3 {
    public static void main(String[] args) {
     A3.show(10);
     B3.show(20);
    }
}
