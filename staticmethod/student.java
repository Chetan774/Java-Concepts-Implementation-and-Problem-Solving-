package com.company.staticmethod;

public class student {
    String name;
    int rollNo;
    static String college = "vit";

    student(String name,int rollNo)
    {
        this.name = name;
        this.rollNo = rollNo;
    }

    public static void main(String[] args) {
        student student1 = new student("Chetan",23);
        student student2 = new student("Kunal",25);
        System.out.println("Student information: ");
        System.out.println("name : "+ student1.name +" "+"Roll No : " + student1.rollNo+" "+"College :"+student1.college);
        System.out.println(student2.name +" "+student2.rollNo+" "+student2.college);



    }


}
