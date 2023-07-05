package com.company.c.Strings;

public class PrintAllSubStrings
{
    public static void main(String[] args) {
        String str = "abc";

        for (int start = 0; start < str.length(); start++) {

            for (int end = start + 1; end < str.length(); end++) {

                System.out.println(str.substring(start, end));// end index is exclusive in substring function

            }

        }
    }
}
