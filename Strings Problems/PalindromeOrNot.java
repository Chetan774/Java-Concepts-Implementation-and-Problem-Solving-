package com.company.c.Strings;

public class PalindromeOrNot
{
    public static void main(String[] args)
    {
        String str = "abba";
        int j = str.length() - 1;
        int i = 0;
        while (i <= j){

            if (str.charAt(i) == str.charAt(j)) {
                j--;
                i++;
            } else {
                System.out.println("Not palindrome");
                return;
            }
        }
        System.out.println("is palindrome");

    }
}

