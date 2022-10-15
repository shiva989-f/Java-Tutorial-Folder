package com.trishulMahadev;

public class controlFLow {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i >= 5 && i <= 6) {
                System.out.println("Skipping the value through continue statement");
                continue;
            } else if (i == 8) {
                System.out.println("Breaking the loop using break statement");
                break;
            }
            System.out.println("i = " + i);
        }

    }
}
