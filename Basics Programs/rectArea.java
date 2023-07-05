package com.company;

public class rectArea {
    public static void main(String[] args) {
        rectangle r1 = new rectangle();
        rectangle r2 = new rectangle();
        r1.setvalues(10,20);
        r2.setvalues(30,40);
        r1.displayarea();
        r2.displayarea();

    }
   static class rectangle
    {
        int length;
        int breadth;

        void setvalues(int length, int breadth)
        {
            this.length = length;
            this.breadth = breadth;
        }

        void displayarea()
        {
            System.out.println("Area : "+length*breadth);
        }
    }
}
