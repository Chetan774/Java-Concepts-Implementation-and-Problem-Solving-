package com.company.ArrayStringLevel2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class SquaresOfSortedArray
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();;
        int nums[] = new int[n];
        for (int i = 0; i < nums.length; i++)
        {
          nums[i] = in.nextInt();
        }

        int res [] = sortedSquares(nums);
        System.out.println(Arrays.toString(res));
    }

    public static int[] sortedSquares(int nums[])
    {
        int res[] = new int[nums.length];
        int i = 0;
        int j = nums.length-1;
        int index = res.length-1;

        while(i <= j)
        {
            int val1 = nums[i] * nums[i];
            int val2 = nums[j] * nums[j];

            if(val1 > val2)
            {
                res[index] = val1;
                i++;
            }

            else
            {
                // condition val1 <= val2
                res[index] = val2;
                j--;
            }

            index--;
        }

        return res;
    }
}
