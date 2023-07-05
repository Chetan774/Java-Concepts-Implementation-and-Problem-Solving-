package com.company.stringLevel1;

import java.util.Scanner;

public class ASCIIdifference {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println(solution2(str));
    }

    public static String solution(String str)
    {
         String s = str.charAt(0)+"";
        for (int i = 1; i < str.length(); i++)
        {
             char curr = str.charAt(i);
             char prev = str.charAt(i-1);
             int diff = curr -prev;
             s += diff;
             s+=curr;
        }
        return s;
    }
    //using string builder
    public static String solution2(String str)
    {
        StringBuilder sb = new StringBuilder();
        sb.append(str.charAt(0));
        for (int i = 1; i < str.length(); i++)
        {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr -prev;
            sb.append(diff);
            sb.append(curr);
        }
        return sb.toString();
    }
}
