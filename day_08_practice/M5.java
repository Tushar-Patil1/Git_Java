package day_08_practice;

public class M5 {
    public static void main(String[] args) {

        String s1="Tushar";
        String s2="Tushar";
        String s3=new String("Tushar");

        System.out.println(s1==s2);
        System.out.println(s1==s3); // reference
        System.out.println(s1.equals(s3)); // content


    }
}
