package com.company.Oops;

public class FrictionUse
{
    public static void main(String[] args)
    {
       Friction f1 = new Friction(50,40);
       f1.print();
       Friction f2 = new Friction(12,17);
       f2.print();

//       f1.add(f2);
//       f1.print();

       Friction f3 = Friction.add(f1,f2);
       f3.print();
    }
}
