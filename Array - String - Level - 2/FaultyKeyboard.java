package com.company.ArrayStringLevel2;

import java.util.Scanner;

public class FaultyKeyboard {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name  = in.nextLine();
        String typed = in.nextLine();
        System.out.println(isPossible(name,typed));
    }

    public static boolean isPossible(String name,String typed)
    {
        if(name.length() > typed.length())
        {
            return false;
        }
        int i = 0;
        int j = 0;

        while(i < name.length() && j < typed.length())
        {
            if(name.charAt(i) == typed.charAt(j))
            {
                i++;
                j++;
            }
            else if(name.charAt(i-1) == typed.charAt(j))
            {
                j++;
            }
            else
            {
                return false;
            }
        }
        while(j < typed.length())
        {
            if(name.charAt(i-1) != typed.charAt(j))
            {
                return false;
            }
            else
            {
                j++;
            }
        }
        return i<name.length()?false:true;
    }
}
