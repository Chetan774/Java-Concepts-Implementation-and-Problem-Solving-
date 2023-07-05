package com.company.ArrayStringLevel2;

import java.util.Scanner;

public class NextGreaterElement {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = in.nextLine();
        String result = nextGreaterElement(str);
        System.out.println("Next Greater element is : ");
        System.out.println(result);
    }

    public static String nextGreaterElement(String str)
    {
        // to char array
        char arr[] = str.toCharArray();
        // find dip
        int i = arr.length-2;
        while(i >= 0 && arr[i] >= arr[i+1])
        {
            i--;
        }
        if(i == -1)
        {
            return "-1";
        }
        // finding max element than ith element
        int k = arr.length-1;
        while (arr[i] >= arr[k])
        {
            k--;
        }
        //swap i with k
        char temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;

        //concatenate 0 to i
        String res ="";
        for (int j = 0; j <= i; j++)
        {
             res +=arr[j];
        }
        //concatenate i+1 to arr.length-1 in reverse
        for (int j = arr.length-1; j > i ; j--)
        {
         res +=arr[j];
        }

        return  res;

    }
}
