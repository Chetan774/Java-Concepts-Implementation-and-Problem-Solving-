package com.company.inheritance;

public class boxmain {
    public static void main(String[] args) {

//        boxWeight box1 = new boxWeight(10, 20, 30, 40);
//        System.out.println("Height : " + box1.height + "\nWidth : " + box1.width + "\nLength : " +
//                box1.length + "\nWeight : " + box1.weight);
        boxprice b1 = new boxprice(10,20,30,40,50);
        System.out.println("Height : " + b1.height + "\nWidth : " + b1.width + "\nLength : " +
             b1.length + "\nWeight : " + b1.weight+"\nCost : "+b1.cost);
    }
}