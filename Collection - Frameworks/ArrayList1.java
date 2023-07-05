package com.company.CollectionFrameworks;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        System.out.println("//adding elements : ");
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(0);
        System.out.println(list);

        System.out.println("//inserting at posn : ");
        list.add(1,5);
        System.out.println(list);

        System.out.println("//removing element : ");
        list.remove(3);
        System.out.println(list);

        System.out.println(" //sorting list : ");
        Collections.sort(list);
        System.out.println(list);

        int arr[] = {1,2,3,4,5,6,7};
        System.out.println(sort(arr));
    }

    //  function of return type list
    public static List<Integer> sort(int nums[])
    {
        ArrayList<Integer> list1 = new ArrayList<>();

        for (int i = 0; i < nums.length; i++)
        {
              list1.add(nums[i]);
        }
        return list1;
    }


}
