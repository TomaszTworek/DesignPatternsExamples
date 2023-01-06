package org.example.builder;

import java.util.List;

//TODO: Create builder for this class and replace it with current constructor. Do this for every object that has more then two fields.
// Try to create object using Builder in Main class.
public class House {

    //TODO: 1. Make constructor private
    //TODO: 2. Create static inner class HouseBuilder. This class have same fields as House class.
    //TODO: 3. HouseBuilder has methods for each filed that setts the value. Every method return HouseBuilder.
    //TODO: 4. Create method build() in HouseBuilder class that create new House using private constructor.
    //TODO: 5. Create static method in House class called builder() that returns new HouseBuilder

    private List<Room> rooms;

    private double height;

    private double squareFootage;

    private boolean hasGarden;

    private String color;

    private int yearOfConstruction;


    public House(List<Room> rooms, double height, double squareFootage, boolean hasGarden, String color, int yearOfConstruction) {
        this.rooms = rooms;
        this.height = height;
        this.squareFootage = squareFootage;
        this.hasGarden = hasGarden;
        this.color = color;
        this.yearOfConstruction = yearOfConstruction;
    }
}
