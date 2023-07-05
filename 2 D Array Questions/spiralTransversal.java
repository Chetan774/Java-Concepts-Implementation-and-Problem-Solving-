package com.company.TwoDArraysLevel1;

public class spiralTransversal {
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int minRow = 0;
        int minCol = 0;
        int maxRow = arr.length-1;
        int maxCol = arr[0].length-1;
        int totalElements = 16;
        int counter = 0;
        while(counter < totalElements)
        {
            // top wall
            for (int j = maxCol; j >= minCol  && counter < totalElements; j--)
            {
                int i = minRow;
                System.out.print(arr[i][j]+" ");
                counter++;
            }
            minRow++;

            //left wall
            for (int i = minRow; i <= maxRow && counter < totalElements; i++)
            {
                int j = minCol;
                System.out.print(arr[i][j]+" ");
                counter++;
            }
            minCol++;

            // right wall
            for (int i = maxRow; i >= minRow && counter < totalElements ; i--)
            {
                int j = maxCol;
                System.out.print(arr[i][j]+" ");
                counter++;
            }
            maxCol--;


            //bottom wall
            for (int j = minCol; j <= maxCol && counter < totalElements; j++)
            {
             int i = maxRow;
                System.out.print(arr[i][j]+" ");
                counter++;
            }
            maxRow--;





        }
    }
}
