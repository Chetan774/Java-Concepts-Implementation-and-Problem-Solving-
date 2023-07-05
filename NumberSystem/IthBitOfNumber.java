package com.company.NumberSystem;

import java.util.Scanner;

public class IthBitOfNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int n = in.nextInt();
        int k = 1<<(n-1);
        System.out.println(k);
    }
}
