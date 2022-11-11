package day_08;

// Generics
// T-> Template variable

public class M7<T> {

    T a;
    T b;

    M7(T a, T b) {
        this.a = a;
        this.b = b;
    }

    void show() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        M7<Integer> i1 = new M7<Integer>(20, 30);
        i1.show();
        System.out.println("********");

        M7<Double> d1 = new M7<Double>(30.5, 25.5);
        d1.show();
        System.out.println("********");

        M7<String> s1 = new M7<String>("abc","pqr");
        s1.show();
        System.out.println("********");

        M7<Object> o1 = new M7<Object>(5,8);
        o1.show();
        System.out.println("********");

        M7<Object> o2 = new M7<Object>("Tushar","Patil");
        o2.show();
        System.out.println("********");

    }

}
