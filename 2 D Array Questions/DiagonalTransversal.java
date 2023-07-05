package com.company.TwoDArraysLevel1;

import java.util.Scanner;

public class DiagonalTransversal {
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
        for (int g = 0; g < arr.length; g++)
        {

            for (int i = 0, j = g; j < arr.length; i++,j++)
            {
                System.out.println(arr[i][j]);
            }
        }
    }
}
