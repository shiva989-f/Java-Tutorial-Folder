package com.trishulMahadev;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your required table number");
        int table = sc.nextInt();

        for (int i = 1; i <=10; i++){
            System.out.printf("%d X %d = %d \n",table,i,table * i);
        }
    }
}
