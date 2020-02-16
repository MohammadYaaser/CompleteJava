package com;

import com.animal.Animal;
import com.animal.Dog;
import com.composition.*;
import com.math.Calculator;
import com.shape.Rectangle;
import com.transport.Outlander;
import com.composition.*;

import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;

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
        Animal animal = new Animal("Animal", 1, 1,5 ,5);

        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20, "long silky");

        dog.eat();
        dog.move();

        int x = 5, y = 10;
        swapsies(x, y);
        System.out.println(x + " " + y);
        /* Using this key work for constructors*/
        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);

        Rectangle rectangle1 = new Rectangle(10, 15);
        System.out.println(rectangle1);

        Rectangle rectangle3 = rectangle;
        System.out.println(rectangle3);

        Rectangle rectangle2 = new Rectangle(10,12, 13, 14);
        System.out.println(rectangle2);

        Calculator.printSum(12, 35);

        System.out.println("\n\nTransport Package is used is Called \n");
        Outlander outlander = new Outlander(36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);

        outlander.stop();
        /* Composition example */
        System.out.println("\n\n Composition \n\n");
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BK-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, monitor, motherboard);
        thePC.getMonitor().drawPixelAt(1500, 1200, "red");
        thePC.getMotherboard().loadProgram("Windows 1.0");
        thePC.getThCase().pressPowerButton();
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

    static void swapsies(int a, int b){
        int temp =a;
        a=b;
        b=temp;
    }
}
