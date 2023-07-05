package com.company.c.Strings;

public class NewPrintSubstring
{
    public static void main(String[] args)
    {
        String str = "pqrs";
        int k = 1;// starting end

        while (k <= str.length())
        {
            int start = 0;
            int end = 0;
            end = end+k;

            while (start < str.length() && end <= str.length())
            {

                System.out.print(str.substring(start,end)+" ");
                start++;
                end++;
            }
            System.out.println();
            k++;
        }

    }
}
