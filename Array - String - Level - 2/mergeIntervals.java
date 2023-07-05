package com.company.DsaQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class mergeIntervals {
    public static int [][]mergeintervals(int Intervals[][])
    {
        Arrays.sort(Intervals,(a,b)->Integer.compare(a[0],b[0]));//sorting acc to first element

        ArrayList<int []> list = new ArrayList<>();
        for (int []interval:Intervals)
        {
            if(list.size()==0)
            {
                list.add(interval);
            }
            else
            {
                int previnterval[]= list.get(list.size()-1);
                if(interval[0] < previnterval[1])
                {
                    previnterval[1] =Math.max(previnterval[1],interval[1]);

                }
                else
                {
                    list.add(interval);
                }
            }

        }
       return list.toArray(new int [list.size()][]);
    }

    public static void main(String[] args) {
        int arr[][] = {{1,3},{2,6},{7,10}};
        mergeintervals(arr);
        System.out.println(arr);
    }
}
