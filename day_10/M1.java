package day_10;

import java.util.ArrayList;
import java.util.Iterator;

class Student{
    int rollNo;
    String name;

    Student(int rollNo, String name){
        this.rollNo=rollNo;
        this.name=name;
    }

}

public class M1 {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        Student s1 = new Student(1,"Tushar");
        Student s2 = new Student(2, "Suraj");
        Student s3 = new Student(3, "Yogita");
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);

        System.out.println(arrayList);

        System.out.println("*********");

        for(Student s:arrayList){
            System.out.println(s.rollNo);
            System.out.println(s.name);
        }

        System.out.println("**********");

        ArrayList<Student> a2 = new ArrayList<>();
        a2.add(new Student(1,"Twinkle"));
        a2.add(new Student(2,"Sumit"));
        a2.add(new Student(3,"Vishal"));

        System.out.println(a2);

        for(Student s: a2){
            System.out.println(s);
        }

        System.out.println(a2.get(0));


    }
}
