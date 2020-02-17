package com;

import com.animal.Animal;
import com.animal.Dog;
import com.composition.*;
import com.composition.challenge.*;
import com.encapsulation.EnhancedPlayer;
import com.encapsulation.Player;
import com.encapsulation.Printer;
import com.math.Calculator;
import com.shape.Rectangle;
import com.transport.Outlander;

import java.io.*;
import java.util.Scanner;

import static java.util.stream.Collectors.joining;


class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plots here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
        super("Jaws");
    }

    public String plot() {
        return "A Shark eats lots of people";
    }
}

class Independence extends Movie {
    public Independence() {
        super("Independence");
    }

    @Override
    public String plot() {
        return "Aliens attempt to take over planet earth";
    }

}


class MazeRun extends Movie {
    public MazeRun() {
        super("Maze Runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
}

class StarWars extends Movie {
    public StarWars() {
        super("StarWars");
    }

    @Override
    public String plot() {
        return "Imperial Forces try to take over universe";
    }
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
    // No Plot Method
}

class Car {
    private boolean engine;
    private int cylinder;
    private String name;
    private int wheels;

    public Car(int cylinder, String name) {
        this.engine = true;
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinder() {
        return cylinder;
    }

    public String getName() {
        return name;
    }

    public String startEngine() {
        return "Car -> startEngine()";
    }

    public String accelerate() {
        return "Car -> accelerate()";
    }

    public String brake() {
        return "Car -> brake()";
    }
}

class Mitshubishi extends Car {
    public Mitshubishi(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Mitshubishi -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Mitshubishi -> accelerate()";
    }

    @Override
    public String brake() {
        return "Mitshubishi -> brake()";
    }
}

class Holden extends Car {
    public Holden(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Holden -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Holden -> accelerate()";
    }

    @Override
    public String brake() {
        return "Holden -> brake()";
    }
}
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
        System.out.println("\n\nComposition :\n");
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

        /*Encapsulation Challenge*/
        //Create a class and demonstrate proper encapsulation techniques
        // the class will be called Printer
        // It will simulate a real Computer Printer
        // It should have fields for the toner Level, number of pages printer, and
        //also whether its a duplex printer (capable of printing on both sides of the paper).
        // Add methods its a duplex printer on both side of the power
        // simulate printing a page (which should increase the number of pages printed).
        // decide on the scope, whether to use constructors, and anything else you  think is needed.

        System.out.println("\n\nEncapsulation Challenge:\n");

        Printer printer = new Printer(50, false);
        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer= " + printer.getPagesPrinted());

        /*polymorphism */
        System.out.println("Polymorphism using class method");

        for (int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + "\n" +
                    "Plot : " + movie.plot() + "\n");
        }

        // Polymorphism Challenge
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
        //Override the appropriate methods to demonstrate polymorphism in use
        // put all classes int the one java file(this one).

        System.out.println("\n\nPolymorphism Challenge");
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Mitshubishi mitshubishi = new Mitshubishi(8, "Outlander VRW 4WD");
        System.out.println(mitshubishi.startEngine());
        System.out.println(mitshubishi.accelerate());
        System.out.println(mitshubishi.brake());

        Car ford = new Car(6, "Ford Falcon") {
            @Override
            public String startEngine() {
                return "Ford -> startEngine()";
            }

            @Override
            public String accelerate() {
                return "Ford -> accelerate()";
            }

            @Override
            public String brake() {
                return "Ford -> brake()";
            }
        };
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

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

    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random() * 5) + 1;
        System.out.println("Random Number generated was : " + randomNumber);
        switch (randomNumber) {
            case 1:
                return new Jaws();
            case 2:
                return new Independence();
            case 3:
                return new MazeRun();
            case 4:
                return new StarWars();
            case 5:
                return new Forgetable();
            default:
                return null;
        }

    }


}