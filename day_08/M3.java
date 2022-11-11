package day_08;

// Call by value
// In case of call by value original value is not changed.


public class M3 {

    int a=10;

    void change(int a){
        a=a+100; // Changes will be in local variable
        System.out.println(a);
    }

    public static void main(String[] args) {

        M3 m3 = new M3();
        System.out.println(m3.a);
        m3.change(100);
        System.out.println(m3.a);

    }
}
