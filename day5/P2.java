package day5;

class A2 {
    int a;
    int b;

    void setValues(int x, int y){
       a=x;
       b=y;
    }

    void getValues(){
        System.out.println(a+" "+b);
    }
}

public class P2 {
    public static void main(String[] args) {
        A2 a2 = new A2();
        a2.getValues();
        a2.setValues(50,60);
        a2.getValues();
        a2.a=80;
        a2.b=90;
        a2.getValues();

    }
}
