package com.company.DsaQuestions;

//kadnanes algorithem
public class MaxSumContigousSubarray {
    public static void main(String[] args) {
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3};
        System.out.println("the max sum of continuous subarray is :" + maxSubArraySum(arr));
    }

    static int maxSubArraySum(int[] arr)
    {
        int max_sum = 0;
        int current_sum = 0;

        for (int j : arr) {
            current_sum = current_sum + j;

            if (current_sum > max_sum) {
                max_sum = current_sum;
            } else if (current_sum < 0) {
                current_sum = 0;
            }

        }
        return  max_sum;
    }
}
