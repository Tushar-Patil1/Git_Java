package day5;

class ABC{
    int id;
    String name;
    static String college="Kharghar";

    void show(){
        System.out.println(id+" "+name+" "+college);
    }
}

public class smain {
    public static void main(String[] args) {
        ABC first = new ABC();
        first.id=81;
        first.name="Sumit";
        first.show();

        ABC second = new ABC();
        second.id=82;
        second.name="Suraj";
        second.show();

    }
}
