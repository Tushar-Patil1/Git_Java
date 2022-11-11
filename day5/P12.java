package day5;

class A12{

    int a;
    int b;

    A12(int x, int y){
        System.out.println("abcdeg");
    }

    public A12() {

    }

    void show(){
        System.out.println(a);
        System.out.println(b);
    }

}

public class P12 {
    public static void main(String[] args) {
        A12 a = new A12();
        a.show();
        A12 b = new A12(10,20);
        b.show();
    }
}
