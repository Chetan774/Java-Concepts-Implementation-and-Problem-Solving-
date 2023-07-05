package com.company.TwoDArraysLevel1;

import java.util.Scanner;

public class SuddlePoint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        int col = in.nextInt();
        int arr[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }


        for (int i = 0; i < arr.length; i++)
        {
            int svj = 0;
            for (int j = 1; j < arr.length; j++)
            {
             if(arr[i][j] < arr[i][svj])
             {
                 svj = j;
             }
            }

            boolean flag = true;
            for (int k = 0; k < arr.length; k++)
            {
               if(arr[k][svj] > arr[i][svj])
               {
                   flag = false;
                   break;
               }

            }
            if(flag == true)
            {
                System.out.println(arr[i][svj]);
            }
        }
        System.out.println("Invalid Input");
    }
}
