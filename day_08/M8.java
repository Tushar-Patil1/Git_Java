package day_08;

public class M8<T extends Number> {

    T a;
    T b;

    M8(T a, T b){
        this.a = a;
        this.b = b;
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
        int sum = a.intValue()+b.intValue();
        System.out.println(sum);
        double sum1 = a.doubleValue()+b.doubleValue();
        System.out.println(sum1);
    }

    public static void main(String[] args) {
        M8<Integer> i1 = new M8<Integer>(20,30);
        i1.show();

        M8<Double> d1 = new M8<Double>(20.20,30.30);
        d1.show();
    }
}
