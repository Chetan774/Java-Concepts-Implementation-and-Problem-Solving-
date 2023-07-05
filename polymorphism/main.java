package com.company.polymorphism;

public class main {
    public static void main(String[] args) {
        // polymorphism
        shape s = new shape();
        shape c = new circle();
        shape sq = new square();

        c.area();
    }
}
