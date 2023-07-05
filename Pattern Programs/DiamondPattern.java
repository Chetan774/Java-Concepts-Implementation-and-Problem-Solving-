package com.company.Patterns;

import java.util.Scanner;

public class DiamondPattern
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        int z = Math.abs(n);
        System.out.println(z);
    }
}
