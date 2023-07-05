package com.company.ArraysLevel1;

import java.util.Scanner;

public class SumOfTwoArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int a1[] = new int[n1];
        for (int i = 0; i <a1.length; i++) {
            a1[i] = in.nextInt();
        }

        int n2 = in.nextInt();
        int a2[] = new int[n2];
        for (int i = 0; i <a2.length; i++) {
            a2[i] = in.nextInt();
        }

        int sum[] = new int[n1>n2?n1:n2];

        int carry = 0;
        int i = a1.length-1;
        int j = a2.length-1;
        int k = sum.length-1;

         while(k >=0)
         {
             int d = carry;
             if(i >= 0)
             {
                 d = d+a1[i];
             }
             if(j >=0)
             {
                 d = d+a2[j];
             }

             carry = d/10;
             d = d%10;
             sum[k] = d;
             i--;
             j--;
             k--;
         }
         if(carry != 0)
         {
             System.out.println(carry);
         }

         for(int val : sum)
         {
             System.out.println(val);
         }
    }
}
