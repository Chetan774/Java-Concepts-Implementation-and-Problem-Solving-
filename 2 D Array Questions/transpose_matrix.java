package com.company.TwoDArraysLevel1;

import java.sql.SQLOutput;
import java.util.Arrays;

public class transpose_matrix
{
    public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] transposedMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }
        return transposedMatrix;
    }

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Input : ");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Output : ");
        System.out.println();
        int ans[][] = transposeMatrix(arr);

        for (int i = 0; i < ans.length; i++) {

            for (int j = 0; j < ans.length; j++) {

                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }

    }
}
