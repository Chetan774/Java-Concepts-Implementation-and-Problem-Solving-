package com.company.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class EX_1_Search_Element
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list  = new LinkedList<>();
        list.add(1);
        list.add(5);
        list.add(7);
        list.add(3);
        list.add(8);
        list.add(2);
        list.add(3);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("Enter value to search : ");
        Scanner in  = new Scanner(System.in);
        int val =  in.nextInt();

        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) == val)
            {
                System.out.println(val+" is present at index : "+ i);
            }

        }
    }

}
