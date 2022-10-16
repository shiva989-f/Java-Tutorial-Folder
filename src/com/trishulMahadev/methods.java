package com.trishulMahadev;

public class methods {
    public static void main(String[] args) {

        // Calling static method
        System.out.println(sum(8933234, 234234));
        print();

        // Calling non static method
        methods obj = new methods();
        System.out.println(obj.string("Shiva Kumar"));

    }

    // static void type method
    static void print(){
        System.out.println("Intellij Idea is the best but not for GUI...");
    }

    // static int type method
    static int sum(int a, int b){
        return a + b;
    }

    // String type method
    String string(String name){
        if (!name.equals("")){
            String greet = "Hello ".concat(name).concat(" How are you!");
            return greet;
        }
        else {
            return "Enter your name";
        }
    }

}
