package day5;

class A8{
    int id;
    String name;
    static String college="Kharghar";

    void show(){
        System.out.println(id+" "+name+" "+college);
    }
}

public class P8 {
    public static void main(String[] args) {
        A8 a8 = new A8();
        a8.id=1;
        a8.name="Sumit";
        a8.show();

        A8 a9 = new A8();
        a9.id=2;
        a9.name="Suraj";
        a9.show();

        A8 a = new A8();
        a.id=3;
        a.name="Tushar";
        a.show();

    }
}
