package com.company.LinkedList;

import java.util.LinkedList;

public class LinkedList_CF
{
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(10);
        list.addFirst(20);
        list.addFirst(30);
        list.addLast(40);
        System.out.println(list);
        list.add(4,50);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
    }
}
