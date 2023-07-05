package com.company.ArraysLevel1;

import java.util.Scanner;

public class CeilAndFloor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++)
        {
                arr[i] = in.nextInt();
        }

        System.out.println("Enter data : ");
        int data = in.nextInt();

        int ceil = 0;
        int floor = 0;
        int low = 0;
        int high = arr.length-1;
        while (low <= high)
        {
            int mid =  (low + high) / 2;

            if(data > arr[mid])
            {
                low = mid + 1;
                ceil = arr[mid];

            }
            else if(data < arr[mid])
            {
                high = mid - 1;
                floor = arr[mid];
            }
            else
            {
                ceil = arr[mid];
                floor = arr[mid];
            }
        }

        System.out.println("ceil : " + ceil + "\nfloor : "+floor);
    }
}
