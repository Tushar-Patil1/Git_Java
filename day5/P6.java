package day5;

public class P6 {
    int a;
    int b;

    void setValues (int a, int b){
        this.a=a;
        this.b=b;
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        P6 p6 = new P6();
        p6.setValues(20,30);
        p6.show();

    }
}
