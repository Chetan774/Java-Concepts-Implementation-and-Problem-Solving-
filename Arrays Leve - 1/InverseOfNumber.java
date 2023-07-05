package com.company.ArraysLevel1;

import java.util.Scanner;
import java.util.concurrent.ScheduledExecutorService;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int n = in.nextInt();
        int inv = 0;
        int op = 1;
        while(n != 0)
        {
            int od = n % 10;
            inv =  inv + op * (int)Math.pow(10,od-1);
            n = n/10;
            op++;
        }
        System.out.println(inv);
    }
}
