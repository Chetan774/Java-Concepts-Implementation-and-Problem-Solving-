package com.company.Patterns;

import java.util.Scanner;

public class Trangular {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        int k = 1;
        for (int i = 1; i <= n; i++)
        {
            k = i;
            for (int j = 1; j <= i ; j++)
            {

                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
