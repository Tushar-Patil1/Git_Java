package day5;

class A3{
    int a;
    int b;
    static int c;

    void showData(){
        c=10;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

}

public class P3 {
    public static void main(String[] args) {
        A3 a3 = new A3();
        a3.showData();
        System.out.println(A3.c);
    }
}
