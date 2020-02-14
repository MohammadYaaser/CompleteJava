package com;

public class Main extends SubClass{
    public Main(int a) {
        super(a);
    }

    public static void main(String[] args) {
        System.out.println("Hello World JAVA");
        Main.display();
    }
    public static void display(){
        System.out.println("From Display");
    }
}
