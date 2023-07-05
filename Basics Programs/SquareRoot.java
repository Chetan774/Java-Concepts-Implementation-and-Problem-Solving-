package com.company;

public class SquareRoot
{
    public static void main(String[] args)
    {
//        int n = 37;
//        int sum = 0;
//        int PrevI = 0;
//
//        for (int i = 1; i < n/2 ; i++)
//        {
//            sum = i * i;
//            if(sum == n)
//            {
//                System.out.println(i);
//                return;
//            }
//            if(sum > n)
//            {
//                System.out.println(PrevI);
//                return;
//            }
//            PrevI = i;
//        }
    }
    public static int mySqrt(int x)
    {
       int st = 1, end = x;
       while (st <= end){
           int mid = (st + end)/2;
           if (mid * mid == x){
               return mid;
           }
           else if (mid * mid > x){
               end = mid - 1;
           }
           else{
               st = mid + 1;
           }
       }
        return end;
    }
}
