package com.company;

public class ComplexNumbers
{
    int real;
    int imaginary;

    //constructor
    public ComplexNumbers(int real, int imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    //add
    public void plus(ComplexNumbers c)
    {
        this.real += c.real;
        this.imaginary += c.imaginary;
    }

    //multiply

    public void multiply(ComplexNumbers c)
    {
        real = real*c.real - imaginary*c.imaginary;
        imaginary = real * imaginary + c.imaginary*c.real;
    }

    public void print()
    {
        System.out.println(this.real+ " " + "+" + " " + "i"+this.imaginary);
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(2,2);
        ComplexNumbers c2 = new ComplexNumbers(2,2);
        c1.plus(c2);
        c1.print();
        c1.multiply(c2);
        c1.print();
    }
}
