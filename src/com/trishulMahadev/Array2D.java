package com.trishulMahadev;

import java.util.Scanner;

public class Array2D {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int [][]  arr = new int[2][4];
        // In 2D array first size is column and second is row
        /*arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[0][3] = 40;

        arr[1][0] = 50;
        arr[1][1] = 60;
        arr[1][2] = 70;
        arr[1][3] = 80;*/

        // Getting element in 2D array
        System.out.println("Input the value:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length + 2; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // Printing element of 2D array

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length + 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}
