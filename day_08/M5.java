package day_08;

public class M5 {

    int  x=40;
    void show(Integer x){
        System.out.println("Printing: "+x);
    }

    public static void main(String[] args) {

        M5 m5 = new M5();
        int b=20;
        Integer a=b;
        System.out.println("Before");
        m5.show(a);
        System.out.println("After");
        System.out.println(a);

    }

}
