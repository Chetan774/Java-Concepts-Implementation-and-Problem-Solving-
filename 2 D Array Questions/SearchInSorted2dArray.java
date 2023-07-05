package com.company.TwoDArraysLevel1;

import java.util.Scanner;

public class SearchInSorted2dArray {
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
        int x = in.nextInt();
        int i = 0;
        int j = arr.length-1;
        while(i < arr.length && j >=0)
        {
            if(x == arr[i][j])
            {
                System.out.println(i+" "+j);
                return;
            }
            else if(x < arr[i][j])
            {
                j--;
            }
            else
            {
                i++;
            }
        }
        System.out.println("Not found");
    }
}
