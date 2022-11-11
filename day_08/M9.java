package day_08;

public class M9 <T> {

    T a;

    void setData(T a){
        this.a=a;
    }

    T getData(){
        return a;
    }

    public static void main(String[] args) {

        M9<Integer> i1 = new M9<>();
        i1.setData(10);
        System.out.println(i1.getData());

        M9<String> s1 = new M9<>();
        s1.setData("Tushar");
        System.out.println(s1.getData());

    }
}
