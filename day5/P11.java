package day5;

class A11 {

    int id;
    String name;
    static String college = "Kharghar";

    A11(int id, String name){
        this.id = id;
        this.name = name;
    }

    void show(){
        System.out.println(id+" "+name+" "+college);
    }

}

public class P11 {
    public static void main(String[] args) {
        A11 a = new A11(1, "Sumit");
        a.show();

        A11 b = new A11(2,"Tushar");
        b.show();

        A11 c = new A11(3, "Suraj");
        c.show();
    }

}
