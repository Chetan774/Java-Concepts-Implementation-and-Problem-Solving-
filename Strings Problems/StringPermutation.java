package com.company.c.Strings;

public class StringPermutation
{
    public static void main(String[] args) {
        int arr[] = new int[256];
        arr[256] = 1;
        System.out.println(arr[256]);
        String str = "abc";
        arr[str.charAt(0)] += 1;
        arr[str.charAt(0)] -= 1;
        System.out.println(arr[str.charAt(0)]);
    }
}
