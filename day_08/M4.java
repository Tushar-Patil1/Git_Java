package day_08;


public class M4 {

    int a=10;

    void change(M4 m4){
        m4.a=m4.a+100; ////changes will be in the instance variable
    }

    public static void main(String[] args) {

        M4 m4 = new M4();
        System.out.println(m4.a);
        m4.change(m4);
        System.out.println(m4.a);

    }

}
