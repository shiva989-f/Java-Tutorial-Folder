package com.trishulMahadev;

public class NESTED_IF_ELSE {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 55;
        int num3 = 74;

        if (num1 > num2){
            if (num1 > num3){
                System.out.println("Num1 is greater among all " + num1);
            }
            else {
                System.out.println("Num3 is greater among all " + num3);
            }
        }
        else {
            if (num2 > num3){
                System.out.println("Num2 is greater among all " + num2);
            }
            else {
                System.out.println("Num3 is greater among all " + num3);
            }
        }

    }
}
