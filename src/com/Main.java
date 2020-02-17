package com;

import com.animal.Animal;
import com.animal.Dog;
import com.composition.*;
import com.composition.challenge.*;
import com.encapsulation.EnhancedPlayer;
import com.encapsulation.Player;
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
        thePC.powerUp();

        /*data encapsulation*/
        Player player = new Player();
        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);

        System.out.println("Remaining heath = " + player.healthRemaining());

        damage = 11;
        player.health = 200;
        player.loseHealth((damage));
        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is  " + enhancedPlayer.getHealth());


        /*Challenge*/
        //Create a single room of a house using composition
        // Think about the things should be included in the room
        // Add at least one method to access an object via a getter and
        // then that object public method to hide the object e.g. not using a getter
        // but to access the object used in composition within the main class
        // like you saw in this video.

        System.out.println("\n\nComposition Challenge:\n");
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(12, 55);

        Bed bed = new Bed("Modern", 4, 3, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        BedRoom bedRoom = new BedRoom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);

        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

        // we are going to go back to the car analogy.
        // Create a base class called car
        // It Should have a few fields that would be appropriate for a generic car class.
        // engine, cylinders, wheels, etc.
        // Constructor should initialize cylinder(number fo) and name, and set wheels to 4
        // and engine to true. Cylinders and names would be passed parameters
        //
        //Create appropriate getters
        //
        //Create some methods like startEngine, accelerate, and brake
        //
        //show s message for each in the base class
        // Now create 3 sub classes for your favourite vehicles


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
