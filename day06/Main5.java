package day06;

class Parent{
     void show(){
        System.out.println("Protected show");
    }
}

class Child extends Parent{
     void show(){
        System.out.println("Public show");
        super.show();
        //Public,Default
    }


}

public class Main5 {
    public static void main(String[] args) {
        Child c = new Child();
        c.show();
    }
}
//