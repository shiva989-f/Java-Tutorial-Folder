package com.trishulMahadev;

import java.util.Scanner;

public class Switch_Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a, b, c, choice;
        System.out.println("Enter two number");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.print("Enter your operator: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                c = a + b;
                System.out.println("Addition of two number is: " + c);
                break;
            case 2:
                c = a - b;
                System.out.println("Subtraction of two number is: " + c);
                break;
            case 3:
                c = a * b;
                System.out.println("Multiplication of two number is: " + c);
                break;
            case 4:
                c = a / b;
                System.out.println("Division of two number is: " + c);
                break;
            case 5:
                c = a % b;
                System.out.println("Remainder of two number is: " + c);
                break;
            default:
                System.out.println("Invalid choice... ");
        }

    }
}
