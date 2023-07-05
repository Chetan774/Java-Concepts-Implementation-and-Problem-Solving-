package com.company.CollegeAssignment;

public class Tester {
    public static void main(String[] args) {
        shape s = new shape();
        s.getInput();
        triangle t = new triangle();
        System.out.println("Area of triangle is : "+ t.setArea(s.height,s.base));
        circle c = new circle();
        System.out.println("Area of circle is : "+c.setArea(s.radius));
        square s1 = new square();
        System.out.println("Area of square is : "+s1.setArea(s.side));

    }
}
