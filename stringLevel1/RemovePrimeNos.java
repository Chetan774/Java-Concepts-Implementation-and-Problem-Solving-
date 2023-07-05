package com.company.stringLevel1;


import java.util.ArrayList;
import java.util.Scanner;


public class RemovePrimeNos {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for (int i = 0; i <n; i++)
        {
         al.add(in.nextInt());
        }
        solution(al);
        System.out.println(al);
    }
    public static void solution(ArrayList<Integer> al)
    {
        for (int i = al.size()-1; i >= 0; i--)
        {
          int val = al.get(i);
          if(isPrime(val) == true)
          {
              al.remove(i);
          }
        }
    }
    public static boolean isPrime(int val)
    {
        for (int divisor = 2; divisor*divisor <= val ; divisor++)
        {
         if(val % divisor == 0)
         {
             return false;
         }

        }
        return true;
    }
}
