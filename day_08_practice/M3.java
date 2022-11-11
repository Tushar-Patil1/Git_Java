package day_08_practice;

public class M3<T> {

    T a;
    T b;

    void setData(T a, T b) {
        this.a = a;
        this.b = b;
    }

    void getData(){
        System.out.println(a+" "+b);
    }


    public static void main(String[] args) {
        M3<Integer> m3 = new M3<Integer>();
        m3.setData(10,20);
        m3.getData();

        M3<String> m31 = new M3<String>();
        m31.setData("Tushar", "Suraj");
        m31.getData();

        M3<Double> m32 = new<Double> M3();
        m32.setData(10.20,20.20);
        m32.getData();


    }

}
