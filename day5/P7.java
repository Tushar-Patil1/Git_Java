package day5;

class A7 {
    int a;
    int b;

    void setValues(int a, int b){
        this.a=a;
        this.b=b;
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(this);
    }
}

public class P7 {
    public static void main(String[] args) {
        A7 a = new A7();
        a.show();
        System.out.println(a);
        A7 a1 = new A7();
        a1.show();
        System.out.println(a1);
    }
}
