package com.company.c.Strings;

public class ReverseWordsInString
{
    public static void main(String[] args)
    {
        String str = "abc def ghi";
        System.out.println(str);
        int StartPointer = 0;
        String str2 = "";

        for (int i = 0; i < str.length(); i++)
        {
           if(str.charAt(i) == ' ')
           {
               for (int j = i - 1; j >= StartPointer; j--)
               {
                   str2 = str2 + str.charAt(j);
               }
               str2 += " ";
               StartPointer = i+1;
           }
        }
        for (int i = str.length()-1; i >= StartPointer ; i--)
        {
              str2 = str2+ str.charAt(i);
        }

        System.out.println(str2);
    }
}
