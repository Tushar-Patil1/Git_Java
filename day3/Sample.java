package day3;


public class Sample {

    int p=100;

    void change(int p){
        p = p+100;
        System.out.println(p);
    }


    public static void main(String[] args) {

        Sample sample = new Sample();
        System.out.println(sample.p);
        sample.change(100);
        System.out.println(sample.p);

    }
}
