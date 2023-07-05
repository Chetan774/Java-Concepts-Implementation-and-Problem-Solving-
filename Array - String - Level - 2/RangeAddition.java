package com.company.ArrayStringLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RangeAddition
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int quarylength = in.nextInt();
        int quares[][] = new int [quarylength][3];
        for (int i = 0; i < quarylength; i++)
        {
            quares[i][0] = in.nextInt();
            quares[i][1] = in.nextInt();
            quares[i][2] = in.nextInt();
        }

        int res[] = getModifiedArray(length,quares);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i]+" ");

        }

    }

    public static int[] getModifiedArray(int length,int quaries[][])
    {
        int res[] = new int[length];
        for (int i = 0; i < quaries.length; i++)
        {
          int start = quaries[i][0];
          int end = quaries[i][1];
          int increment = quaries[i][2];

          res[start] += increment;
          if(end+1 < res.length)
          {
              res[end+1] -= increment;
          }
        }
        int sum = 0;
        for (int i = 0; i < res.length; i++)
        {
          sum += res[i];
          res[i] = sum;
        }
        return res;
    }
}
