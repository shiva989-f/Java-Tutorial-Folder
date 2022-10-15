package com.trishulMahadev;

import java.util.Scanner;

public class addNo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Give to number to add");
        int num1 = sc.nextInt();
        double num2 = sc.nextDouble();
        double sum = (num1 + num2);
        System.out.println("Sum of two number is " + sum);

    }
}
