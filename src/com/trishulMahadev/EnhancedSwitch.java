package com.trishulMahadev;

import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        System.out.print("Enter number between 1 to 4: ");
        choice = sc.nextInt();

        switch (choice){
            case 1 ->{
                System.out.println("You are devil");
            }
            case 2 ->{
                System.out.println("You are happy");
            }
            case 3 ->{
                System.out.println("Mahadev bless you");
            }
            case 4 ->{
                System.out.println("You are Joker");
            }
            default -> System.out.println("Shiva is the best");
        }

    }
}
