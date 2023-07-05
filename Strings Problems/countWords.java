package com.company.c.Strings;

import java.util.Scanner;

public class countWords
{

    public static void main(String[] args)
    {
        int count = 0;
        Scanner s  = new Scanner(System.in);
        String str = s.nextLine();
        System.out.println(str.length());
        for(int i = 0; i < str.length(); i++)
        {
            if(str.charAt(i) == ' ')
            {

                count++;
            }
        }

        System.out.println("count : "+ (count+1));
    }
}
