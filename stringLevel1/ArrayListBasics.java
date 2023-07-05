package com.company.stringLevel1;

import java.util.ArrayList;

public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        // insertion at particular position
        list.add(1,1000);
        System.out.println("After insertion of 1st element : " +list);

        //deletion
        list.remove(1);
        System.out.println("After removal of 1st element : " + list);

        //change the element
        list.set(2,2000);
        System.out.println("After changing the 2nd element : " +list);

        //arraylist of strings

        ArrayList<String > list2 = new ArrayList<>();
        list2.add("Hello");
        list2.add("Cheten");
        list2.add("Patil");
        System.out.println("Arraylist of strings : " +list2);
    }

}
