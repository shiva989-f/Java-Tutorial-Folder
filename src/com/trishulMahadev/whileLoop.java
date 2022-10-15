package com.trishulMahadev;

import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any number: ");
        int num = sc.nextInt();

        while (num >=0){
            if (num % 2 == 0){
                System.out.print("Even number");
                break;
            }
            else {
                System.out.print("Odd number");
                break;
            }
        }

    }
}
