package com.company.TwoDArraysLevel1;

public class waveTransversal {
    public static void main(String[] args) {
        int arr[][] = {{11,12,13},{21,22,23},{31,32,33}};
        int row =  arr[0].length;
        for (int i = 0; i < row; i++)
        {
            if(i % 2 == 0)
            {
                for (int j = 0; j < arr.length; j++)
                {
                    System.out.println(arr[j][i]+" ");
                }
            }
            else
            {
                for (int j = arr.length-1; j >=0 ; j--)
                {
                    System.out.println(arr[j][i] + " ");
                }
            }
        }
    }
}
