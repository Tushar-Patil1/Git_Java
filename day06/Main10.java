package day06;

interface Pqr{
     void show();
}

interface Q{
    void display();
}

class Z implements Pqr,Q{

    @Override
    public void show() {
        System.out.println("Show from PQR");
    }

    @Override
    public void display() {
        System.out.println("Display");
    }
}

class X implements Pqr{

    @Override
    public void show() {
        System.out.println("jhkjzhbcjzgb");
    }
}

public class Main10 {
    public static void main(String[] args) {

    }
}
