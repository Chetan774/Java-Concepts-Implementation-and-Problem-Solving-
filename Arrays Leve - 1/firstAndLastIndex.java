package com.company.ArraysLevel1;

public class firstAndLastIndex {
    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,30,40,40,40,50};

        int high = arr.length-1;
        int low = 0;
        int data = 40;
        int fi = 0;
        int li = 0;
        while(low <= high)
        {
            int mid = (low + high ) / 2;

            if(data > arr[mid])
            {
                low = mid + 1;
            }
            else if(data < arr[mid])
            {
                high = mid-1;
            }
            else
            {
                fi = mid;
                high = mid-1;
            }
        }

         high = arr.length-1;
         low = 0;
        while(low <= high)
        {
            int mid = (low + high ) / 2;

            if(data > arr[mid])
            {
                low = mid + 1;
            }
            else if(data < arr[mid])
            {
                high = mid-1;
            }
            else
            {
                li = mid;
                low = mid+1;
            }
        }

        System.out.println("first index : "+ fi + "\nLast index : "+li);
    }
}
