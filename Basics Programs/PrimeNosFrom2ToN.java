package com.company;

import java.util.Scanner;

public class PrimeNosFrom2ToN {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();

        System.out.println(2);

        for(int i = 3; i <= n; i++)
        {
            boolean a = false;

            for(int j = 2; j <= i/2; j++)
            {
                if(i % j == 0)
                {
                    a = true;
                }
            }
            if(a == false)
            {
                System.out.println(i);
            }
        }


    }
}
