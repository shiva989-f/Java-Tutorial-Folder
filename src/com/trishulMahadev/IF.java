package com.trishulMahadev;

import java.util.Scanner;

public class IF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your password!");
        final int pass = 882004;
        int pwd = sc.nextInt();
        if(pwd == pass){
            System.out.println("You unlocked the Locker");
        }
    }
}
