package day06;

class A1{
    void show(int x){
        System.out.println("A1 vala show");
    }
}

class C1 extends A1{
     void show(int x){
         System.out.println("C1 vala show");
     }
}
public class Main2 {
    public static void main(String[] args) {

        A1 a = new C1();
        a.show(10);

    }
}
