package com.trishulMahadev;

public class typesOfVariable {
    int a = 10; // Instance variable
    static double b = 20.5; // Static variable
    public static void main(String[] args) {
        boolean check = true; // Local variable
        typesOfVariable obj = new typesOfVariable();
        int d = obj.a;
        System.out.println(obj.a);
        System.out.println(d);
        System.out.println(new typesOfVariable().a);
        System.out.println(b);
        System.out.println(check);

    }
}
