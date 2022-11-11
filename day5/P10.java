package day5;

public class P10 {

    int a;
    int b;

    P10(){
        a=200;
        b=300;
    }

    P10(int x, int y){
        a=x;
        b=y;
    }

    P10(int x, int y, int z){
        System.out.println("Only printing");
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        P10 p = new P10();
        p.show();
        P10 p1 = new P10(10,20);
        p1.show();
        P10 p2 = new P10(10,20,30);
        p2.show();

    }

}
