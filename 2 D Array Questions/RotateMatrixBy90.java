package com.company.TwoDArraysLevel1;

import java.util.Scanner;

public class RotateMatrixBy90
{
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
        int k = arr[0].length-1;

        int arr1[][] = new int[row][col];
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
            arr1[j][k] = arr[i][j];
            }
            k--;
        }
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[0].length; j++)
            {
                System.out.print(arr1[i][j]+" ");;
            }
            System.out.println();
        }

    }
}
