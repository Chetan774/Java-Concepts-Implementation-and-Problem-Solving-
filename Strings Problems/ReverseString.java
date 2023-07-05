package com.company.c.Strings;

import java.util.Scanner;

public class ReverseString
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String reverseString = "";
        for (int i = 0; i < str.length(); i++)// Transversing through beginning :  Approach
        {
            reverseString = str.charAt(i)+reverseString;
        }

        System.out.println(reverseString);
    }
}
