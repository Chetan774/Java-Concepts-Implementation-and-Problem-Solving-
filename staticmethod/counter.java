package com.company.staticmethod;

public class counter {

    public static void main(String[] args) {
     count count1 = new count();
     count count2 = new count();
     count count3 = new count();

        System.out.println(count1.count);
        System.out.println(count2.count);
        System.out.println(count3.count);
    }

    static class count{
        static int count = 0;

        count()
        {
            count++;
        }

    }

}


