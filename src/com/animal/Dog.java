package com.animal;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int teeth;
    private String coat;

    public Dog(String name, int i, int brain, int body, int size, int weight, int teeth, String coat) {
        super(name, brain, body, size, weight);
        this.eyes = eyes;
        this.legs = legs;
        this.teeth = teeth;
        this.coat = coat;
    }

    @Override
    public void eat() {
        System.out.println("Dog.eat() called ");
        chew();
        super.eat();
    }

    private void chew(){
        System.out.println("Dog.chew() called");
    }

}
