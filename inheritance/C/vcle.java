package com.company.inheritance.C;

class vcle{
    String colour;
    private int number;
    void set(int number)
    {
        number=number;
    }
    int get()
    {
        return number;
    }
}

class Car extends vcle{
    public static void main(String[] args) {
        vcle v = new vcle();
        v.colour = "white";
        v.set(1010) ;
        System.out.println(v.colour + " " + v.get());
    }
}
