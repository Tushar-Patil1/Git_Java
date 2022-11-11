package day06;

class A6{

    void show(){
        System.out.println("Hello");
    }

    int show(int x){
        System.out.println(10);
        return 5;
    }

    String show(String S){
        System.out.println("Tushar");
        return "Stringg";
    }
}

public class Main6 {
    public static void main(String[] args) {
        //CONCLUSION -> Method overoloading is not possible by
        // changing return type .
        System.out.println("Main6 main");
    }

    public static void main(int x){
        System.out.println("Main6 overload");
    }
}
// We can overload main method but kuch fayda nhi e;