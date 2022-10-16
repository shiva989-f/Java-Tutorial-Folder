package com.trishulMahadev;

import java.util.Arrays;

public class ternaryOperator {
    public static void main(String[] args) {

        int a = 32, b = 23, c = 75, d;

        d = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println(d);

    }
}
