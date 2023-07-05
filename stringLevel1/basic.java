package com.company.stringLevel1;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();//input
        System.out.println(s);

        // accessing elements of string
        char ch = s.charAt(0);
        System.out.println("Char 1 is : " + ch);

        // length of string
        System.out.println("Length is : "+ s.length());

        //printing all elements one by one
        for (int i = 0; i < s.length(); i++)
        {
            System.out.println(s.charAt(i));
        }
    }
}
