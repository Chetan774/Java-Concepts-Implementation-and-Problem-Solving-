package com.company.inheritance;

public class box {
    int length;
    int width;
    int height;

    box(){
        this.length = -1;
        this.width = -1;
        this.height = -1;
    }
    box(int length,int width,int height)
    {
        this.length = length;
        this.width = width;
        this.height = height;
    }
    // copy constructor
    box(box old)
    {
        this.length = old.length;
        this.width = old.width;
        this.height = old.height;

    }

    public static void main(String[] args) {
        box box1 = new box(10,20,30);
        box box2 = new box(box1);//coppied the info of box1 in box2
        System.out.println("length : "+ box2.length + " \nwidth : "+box2.width +"\nheigth : "+box2.height);
    }
}
