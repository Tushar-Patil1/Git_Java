package day06;

abstract class Abc{
    public abstract void dinner();

    public void norml(){
        System.out.println("hkgdjgda");
    }

}

class Harshal extends Abc{

    public void dinner(){
        System.out.println("Harshal ke ghar ka dinner");
    }
}

class Gaurav extends Abc{

    public void dinner(){
        System.out.println("Gaurav ke ghar ka dinner");
    }
}

class Tushar{

}

public class Main9 {
    public static void main(String[] args) {
        Harshal harshal = new Harshal();
        harshal.dinner();

        Gaurav gaurav = new Gaurav();
        gaurav.dinner();
    }

}
