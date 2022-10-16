package com.trishulMahadev;

public class logicalOperator {
    public static void main(String[] args) {

        int a = 20;
        int b = 20;

        System.out.println(a == b && a!=b); // 20 is equal to 20 and 20 is not equal to 20
        System.out.println(a == b || a!=b); // 20 is equal to 20 or 20 is not equal to 20
        System.out.println(!(a == b)); // 20 is not equal to 20
    }
}
