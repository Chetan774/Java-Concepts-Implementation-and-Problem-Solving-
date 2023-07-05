package com.company.TwoDArraysLevel1;

import java.util.List;

public class jocepus_problem
{
    public static int Iterative(int n, int k)
    {
        int sum = 0;

        for(int i = 2; i <= n; i++)
        {
            sum = (sum + k) % i;
        }

        return sum+1;
    }

    public static void recursive(List<Integer> person, int k, int index)
    {
            if (person.size() == 1)
            {
                System.out.println(person.get(0));
                return;
            }

            index = ((index + k) % person.size());

            person.remove(index);

            recursive(person, k, index);
    }

//    public static void usingQueue()


    public static void main(String[] args)
    {
        int n = 5;
        int k = 2;
        jocepus_problem obj = new jocepus_problem();
        System.out.println(obj.Iterative(n, k));
    }


}
