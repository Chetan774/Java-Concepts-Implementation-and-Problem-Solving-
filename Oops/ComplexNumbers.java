package com.company.Oops;

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
        this.real = this.real*c.real - this.imaginary*c.imaginary;
        this.imaginary = this.real*c.imaginary + this.imaginary*c.real;
    }

    public void print()
    {
        System.out.println(this.real+ " " + "+" + " " + "i"+this.imaginary);
    }

    public static void main(String[] args) {
        ComplexNumbers c1 = new ComplexNumbers(3,6);
        c1.print();
        ComplexNumbers c2 = new ComplexNumbers(7,9);
        c1.multiply(c2);
        c1.print();
    }
}
