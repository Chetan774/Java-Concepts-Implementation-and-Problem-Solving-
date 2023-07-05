package com.company.staticmethod;

public class cube {
    public static void main(String[] args) {
      int result  = cube.cube(5);
        System.out.println(result);
    }
    static int cube(int x)
    {
        return x*x*x;
    }
}
