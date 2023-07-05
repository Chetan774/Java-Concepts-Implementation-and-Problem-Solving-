package com.company;

import java.util.Scanner;

public class CheckNoSequence
{
    public static void main(String[] args)
    {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++)
        {
             arr[i] = s.nextInt();
        }


        for (int i = 0; i < n-1; i++)
        {
              if(arr[i] > arr[i+1])
              {
                  continue;
              }
              else if( arr[i]  == arr[i+1])
              {
                  System.out.println(false);
                  return;
              }
              else if(arr[i+1] > arr[i])
              {

                  int j = i+1;
                  while (j < n-1)
                  {
                         if(arr[j+1] > arr[j])
                         {
                             j++;
                             continue;
                         }
                         else if(arr[j+1] <= arr[j])
                         {
                             System.out.println(false);
                             return;
                         }
                         j++;
                  }
                  System.out.println(true);
                  return;
              }
        }
        System.out.println(true);
        return;

    }
}
