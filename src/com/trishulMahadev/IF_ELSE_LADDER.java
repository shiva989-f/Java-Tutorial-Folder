package com.trishulMahadev;

import java.util.Scanner;

public class IF_ELSE_LADDER {
    public static void main(String[] args) {

        int marks = new Scanner(System.in).nextInt();

        if (marks >=90 && marks <= 100)
            System.out.println("First Division");
        else if (marks >=70 && marks <= 80)
            System.out.println("Second Division");
        else if (marks >=60 && marks < 70)
            System.out.println("Third Division");
        else
            System.out.println("Pass");

    }
}
