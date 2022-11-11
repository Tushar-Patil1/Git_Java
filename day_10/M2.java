package day_10;

import java.util.ArrayList;

class Student2{
    int rollNo;
    String name;

    Student2(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

}

public class M2 {

    public static void display(ArrayList<Student2> s){
        for(Student2 st: s){
            System.out.println(st.name);
            System.out.println(st.rollNo);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student2> arrayList = new ArrayList<>();
        Student2 student1 = new Student2(1,"Tushar");
        Student2 student2 = new Student2(2,"Patil");

        arrayList.add(student1);
        arrayList.add(student2);

        System.out.println(arrayList);

        display(arrayList);
       // System.out.println(arrayList);
    }
}
