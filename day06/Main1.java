package day06;
// Method overloading // complietime poly
class ABC{

    public void show(){
        System.out.println("ABC show");
    }

    public void show(int x){
        System.out.println("Int x vala show");
    }

    public void show(int x, int y){
        System.out.println("Int y vala show");
    }
}

public class Main1 {
    public static void main(String[] args) {
        ABC abc = new ABC();
        abc.show();
        abc.show(5);
        abc.show(5,6);
    }

}
