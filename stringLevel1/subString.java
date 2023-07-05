package com.company.stringLevel1;

public class subString
{
    public static void main(String[] args)
    {
//        String s = "Chetan";
//        // printing substring using function
//        System.out.println(s.substring(0,3));
//
//        //printing all substrings present in a string
//
//        for (int i = 0; i < s.length(); i++)
//        {
//            for (int j = i+1; j <= s.length(); j++)
//            {
//                System.out.print(s.substring(i,j)+ " ");
//            }
//            System.out.println();
//        }

        //split the substrings
        String a = "abc ghi jkl mno";
        String parts[] = a.split(" ");
        for (int i = 0; i < parts.length; i++)
        {
            System.out.println(parts[i]);
        }




    }

}
