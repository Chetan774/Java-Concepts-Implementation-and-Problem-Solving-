package com.company.DsaQuestions;

public class unionSortedArray {
    public static void main(String[] args) {
        int arr1[] = {1,2,3,4,5,7};
        int arr2[] = {7,8,9};
        union(arr1,arr2,arr1.length,arr2.length);

    }

    static void union(int arr1[],int arr2[],int m,int n)
    {
        int i=0,j = 0;
        while ( i<m &&  j < n)
        {
        if(arr1[i] < arr2[j])
        {
            System.out.println(arr1[i++]+" ");
        }
        else if(arr2[j] < arr1[i])
        {
            System.out.println(arr2[j++]+" ");
        }

        else
        {
            System.out.println(arr1[i++]+ " ");
            j++;
        }
    }
        //printing extra elements of array
        while(i<m)
        {
            System.out.println(arr1[i++]+" ");
        }
        while(j<n)
        {
            System.out.println(arr2[j++]+" ");
        }


    }
}
