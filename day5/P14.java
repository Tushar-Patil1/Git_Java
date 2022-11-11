package day5;

public class P14 {
    int a = 23;
    static int v = 10;

    public static void main(String[] args) {
        P14 p = new P14();
        System.out.println(v++);
        for (int i=0; i<9;i++){
            System.out.println(v++);
        }
        System.out.println("*******");
        System.out.println(v);
    }
}
