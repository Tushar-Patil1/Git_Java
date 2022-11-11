package day5;

class P9 {

    int a;
    int b;

    P9(){
        a=100;
        b=200;
    }

    void show(){
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {

        P9 p9 = new P9();
        p9.show();
        P9 p = new P9();
        p.show();
    }


}
