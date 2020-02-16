package com.composition;

public class Case {
    private String model;
    private String manufacturer;
    private String poserSupply;
    private Dimensions dimensions;

    public Case(String model, String manufacturer, String poserSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.poserSupply = poserSupply;
        this.dimensions = dimensions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPoserSupply() {
        return poserSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
