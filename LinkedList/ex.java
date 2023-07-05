package com.company.LinkedList;

import java.util.LinkedList;

public class ex
{
    public static void main(String[] args)
    {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        System.out.println(list.size());
        list.removeLast();
        System.out.println(list);
        System.out.println(list.size());

    }

}
