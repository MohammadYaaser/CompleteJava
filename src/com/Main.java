package com;

import java.io.*;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class Main extends SubClass{

    private static final Scanner scanner = new Scanner(System.in);

    public Main(int a) {
        super(a);
    }

    public static void main(String[] args) throws IOException {
        /*int myFirstNumber = 5;
        System.out.println("myFirstNumber :" + myFirstNumber);
        System.out.println("Hello World JAVA");
        Main.display();

        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Min :" + myMinIntValue);
        System.out.println("Integer Max :" + myMaxIntValue);

        System.out.println("Integer Min :" + (myMinIntValue - 1) );
        System.out.println("Integer Max :" + (myMaxIntValue + 1));

        int myMaxIntTest = 2_147_483_647;

        System.out.println("myMaxIntTest :" + myMaxIntTest);

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("myMinByteValue :" + myMinByteValue);
        System.out.println("myMaxByteValue : " + myMaxByteValue);

        char myUnicodeChar = '\u0044';
        System.out.println(myUnicodeChar);

        System.out.println(5 % 6);*/

        /*OOPS Concepts */
        /*inheritance*/


    }
    public static void display(){
        System.out.println("From Display");
    }
    static int simpleArraySum(int[] ar) {
        int result = 0;
        for(int count : ar){
            result += count;
        }
        return result;
    }
}
