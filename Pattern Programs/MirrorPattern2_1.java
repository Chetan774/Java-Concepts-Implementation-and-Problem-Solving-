package com.company.Patterns;

import java.util.Scanner;

public class MirrorPattern2_1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j < i ; j++) {

                System.out.print(" ");

            }

            for (int j = i; j <= n ; j++) {

                System.out.print("*");

            }

            System.out.println();

        }
    }
}
