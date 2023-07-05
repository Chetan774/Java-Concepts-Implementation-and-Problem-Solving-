package com.company.stringLevel1;

public class test
{
    public static String minLengthWord(String input)
    {
        int currentIndex = 0;
        int endIndex = 0;

        String Result = "";

        int length = Integer.MAX_VALUE;

        for(int i = 0; i < input.length(); i++)
        {
            if(input.charAt(i) == ' ')
            {
                endIndex = i ;
                if(endIndex - currentIndex < length)
                {
                    length = endIndex - currentIndex;
                    Result = input.substring(currentIndex, endIndex);
                }
            }
            else
            {
                continue;
            }

            currentIndex = i+1;
            }


        return Result;
    }




    public static void main(String[] args)
    {
         String str = "this is a string";
        System.out.println(minLengthWord(str));
    }
}
