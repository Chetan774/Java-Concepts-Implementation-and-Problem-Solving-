package com.company.DsaQuestions;

import java.util.Arrays;

public class MinimiseMaxDiffBetnHightsofTowers {
    public static void main(String[] args) {
        int arr[] = {7,3,12};
        int k = 8;
        int Result = minimiseMaxDiff(arr,k,arr.length);
        System.out.println(Result);

    }

    static int minimiseMaxDiff(int arr[],int k,int n)
    {
        Arrays.sort(arr);
        int smallest = arr[0] + k;
        int largest = arr[n-1] - k;
        int ans  = arr[n-1] - arr[0];
        int minimum,maximum;

        for (int i = 0; i < n-1; i++)
        {
            minimum = min(smallest,arr[i+1]-k);
            maximum = max(largest,arr[i] + k);

            if(minimum < 0){
                continue;
            }

            ans = min(ans,minimum-maximum);

        }
        return ans;
    }

    static int max(int x,int y)
    {
        if(x > y)
        {
            return x;
        }
        else{
            return  y;
        }
    }
    static int min(int x,int y)
    {
        if(x < y)
        {
            return x;
        }
        else{
            return  y;
        }
    }
}
