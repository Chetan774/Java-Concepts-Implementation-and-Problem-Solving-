package com.company.ArrayStringLevel2;

import java.util.Scanner;

public class MaxWater
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int heights[] = new int [n];
        for (int i = 0; i < heights.length; i++)
        {
          heights[i] = in.nextInt();
        }

        int result = maxWater(heights);
        System.out.println(result);
    }

    public static int maxWater(int heights[])
    {
        int i = 0;
        int j = heights.length - 1;

        int water = 0;
        while (i < j)
        {
            int h = Math.min(heights[i],heights[j]);
            int w = j-i;
            water = Math.max(water,h * w);

            if(heights[i] < heights[j])
            {
                i++;
            }
            else
            {
                j--;
            }

        }
        return water;
    }
}
