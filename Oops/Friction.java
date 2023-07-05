package com.company.Oops;

public class Friction
{
    int numerator;
    int denominator;

    //constructor
    public Friction(int numerator,int denominator)
    {
        this.numerator = numerator;
        this.denominator = denominator;

        simplify();
    }
    //getter setter
    public int getNumerator()
    {
        return numerator;
    }
    public void setNumerator(int n)
    {
        numerator = n;
        simplify();
    }
    public int getDenominator()
     {
         return denominator;
     }
     public void setDenominator(int n)
     {
         denominator = n;
         simplify();
     }

     //addition fn

    public  void add(Friction f2)
    {
        this.numerator = this.numerator*f2.denominator + f2.numerator*this.denominator;
        this.denominator = this.denominator*f2.denominator;
        simplify();
    }

    // addition of 2 friction objects
    // making this function static to access it using class name
    public static Friction add(Friction f1, Friction f2)
    {
        int num = f1.numerator*f2.denominator + f2.numerator*f1.numerator;
        int deno = f1.denominator * f2.denominator;
        Friction f = new Friction(num,deno);
        return f;
    }

    //simplify fn
    public void simplify()
    {
        int gcd = 1;
        int smaller = Math.min(this.numerator,this.denominator);
        for (int i = smaller; i >= 2 ; i--)
        {
            if(this.numerator % i == 0 && this.denominator % i == 0)
            {

                gcd = i;
                break;
            }
        }
        numerator = numerator/gcd;
        denominator = denominator/gcd;
    }

    //print fn
    public void print()
    {
        if(denominator  == 1)
        {
            System.out.println(numerator);
        }
        else
        {
            System.out.println(numerator+ " / "+denominator);
        }

    }


}
