package com.company.stringLevel1;

public class StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);

        char ch = sb.charAt(0);
        System.out.println("Char at 0th pos : "+ ch);

        sb.setCharAt(0,'d');//update
        System.out.println("Updated string is : "+ sb);

        sb.insert(2,'y');//insertion
        System.out.println("after insertion : " + sb);

        sb.deleteCharAt(2);//remove
        System.out.println("After deletion : " + sb);

        sb.append('g');//append
        System.out.println(sb);

    }
}
