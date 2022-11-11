package day06;

class A{

    public void show(){
        System.out.println("Hello");
    }

}

class B extends A{

    public void display(){
        System.out.println("Displaying");
    }
}

public class Sample {
    public static void main(String[] args) {
        A a = new A();
        a.show();
        B b = new B();
        b.show();
        b.display();

        A a1 = new B(); //Upcasting
        a1.show();

    }
}
