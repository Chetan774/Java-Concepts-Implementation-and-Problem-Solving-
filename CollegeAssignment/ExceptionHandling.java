package com.company.CollegeAssignment;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args)
    {
        int n1;
        int n2;
        int n3;
        Scanner in  = new Scanner(System.in);

        //Arithmetic Exception
        System.out.println("Enter two numbers : ");
        n1 =  in.nextInt();
        n2 = in.nextInt();
        try
        {
         n3 = n1 / n2;
            System.out.println("n3 : "+ n3);
        }
        catch (ArithmeticException e)
        {
            System.out.println("You shouldent divide a number by 0 !!!");
            System.out.println(e);
            System.out.println();
        }

        //ArrayIndexOutOfBound

        int arr[] = {1,2,3,4,5,6};
        try {
            for (int i = 0; i < arr.length + 1; i++)
             {
                System.out.println(arr[i++]);
             }
            }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("OOPs!!!Array Index 7 out of bounds for length 6.");
            System.out.println(e);
            System.out.println();
        }

        //NullPointerException
        try
        {
         String str = null;
            System.out.println("String length is : "+ str.length());
        }
        catch (NullPointerException e)
        {
            System.out.println("Null Pointer exception arises !!!");
            System.out.println(e);
            System.out.println();
        }




    }
}
