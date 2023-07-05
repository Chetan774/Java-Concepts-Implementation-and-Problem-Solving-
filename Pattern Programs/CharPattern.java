package com.company.Patterns;

import java.util.Scanner;

public class CharPattern {
    public static void main(String[] args) {

        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i <n; i++)
        {
            char StartingChar = 'A';
            for (int j = 0; j <n ; j++)
            {
                System.out.print(StartingChar);
                StartingChar = (char)(StartingChar + 1);
            }
            System.out.println();
        }
    }
}
