package com.company.BreakContinueUse;
import  java.util.Scanner;

public class CharInput
{
    public static void main(String args[])
    {
        System.out.println("Enter char : ");

        Scanner s = new Scanner(System.in);

        char ch = s.next().charAt(0);

        System.out.println(ch);

    }
}
