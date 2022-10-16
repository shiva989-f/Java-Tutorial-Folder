package com.trishulMahadev;

public class IncreDecreOperator {
    public static void main(String[] args) {

        int a = 5;
        int b = 5;

        // Post Increment
        System.out.println(a++); // print 5 than add 1 -----> 6
        // Pre Increment
        System.out.println(++a); // Above value is increased by 1 so 5 become 6 and in this statement 1 is added in 6 first, then it print 7

        // Post Decrement
        System.out.println(b--); // // print 5 than minus 1 -----> 4
        // Pre Decrement
        System.out.println(--b); // Above value is decreased by 1 so 5 become 4 and in this statement 1 is minus in 4 first, then it print 3

    }
}
