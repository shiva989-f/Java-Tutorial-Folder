package com.trishulMahadev;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*int []  arr = {34,56,23,7623,23};
        System.out.println(arr[2]);
        System.out.println("Printing all the elements in array with for each loop");
        for (int array : arr) {
            System.out.println(array);
        }*/


        /*int [] arr2 = new int[5];
        arr2[0] = 10;
        arr2[1] = 20;
        arr2[2] = 30;
        arr2[3] = 40;
        arr2[4] = 50;

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }*/

        // User input array
        System.out.println("Enter the array size.");
        int size = sc.nextInt();
        int [] inputArr = new int[size];
        // Getting input in array from loop
        System.out.println("Put the value in array");
        for (int i = 0; i < size; i++) {
            inputArr[i] = sc.nextInt();
        }
        // Printing inputArr with sorting in ascending order
        Arrays.sort(inputArr);
        System.out.println("Printing the inputArr array");
        for (int inputPrint : inputArr) {
            System.out.print(inputPrint + " ");
        }



    }
}
