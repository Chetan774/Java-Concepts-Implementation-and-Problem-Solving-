package com.company.CollectionFrameworks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class solution {
    public static int[] plusOne(int[] digits) {
        ArrayList<Integer> list = new ArrayList<>();

        int sum = 0;
        int k = 1;
        for(int  i = 0; i < digits.length;i++)
        {
            sum+=digits[i] * 10 ^ digits.length-k;
            k++;
        }
        sum+=1;

        while(sum > 0)
        {
            int r = sum % 10;
            list.add(r);
            sum = sum/10;
        }
        Collections.reverse(list);

        for(int l = 0;l< digits.length;l++)
        {
            digits[l] = list.get(l);
        }

        return digits;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3};
        System.out.println(plusOne(arr));

    }
}
