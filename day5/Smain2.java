package day5;

class sam{

    int a;
    int b;
    static int c;

    void show(){
        System.out.println("hello");
    }

    static void display(){
        System.out.println("Welcome");
    }
}

public class Smain2 {
    public static void main(String[] args) {
        sam.display();
        sam s = new sam();
        s.show();
    }
}
