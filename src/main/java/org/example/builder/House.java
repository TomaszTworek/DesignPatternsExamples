package org.example.builder;

import java.util.List;

public class House {

    private List<Room> rooms;

    private double height;

    private double squareFootage;

    private boolean hasGarden;

    private String color;

    private int yearOfConstruction;

    private House(List<Room> rooms, double height, double squareFootage, boolean hasGarden, String color, int yearOfConstruction) {
        this.rooms = rooms;
        this.height = height;
        this.squareFootage = squareFootage;
        this.hasGarden = hasGarden;
        this.color = color;
        this.yearOfConstruction = yearOfConstruction;
    }

    public static HouseBuilder builder() {
        return new HouseBuilder();
    }

    public static class HouseBuilder {

        private List<Room> rooms;

        private double height;

        private double squareFootage;

        private boolean hasGarden;

        private String color;

        private int yearOfConstruction;

        public HouseBuilder rooms(List<Room> rooms) {
            this.rooms = rooms;
            return this;
        }

        public HouseBuilder height(int height) {
            this.height = height;
            return this;
        }

        public HouseBuilder squareFootage(double squareFootage) {
            this.squareFootage = squareFootage;
            return this;
        }

        public HouseBuilder hasGarden(boolean hasGarden) {
            this.hasGarden = hasGarden;
            return this;
        }

        public HouseBuilder color(String color) {
            this.color = color;
            return this;
        }

        public HouseBuilder yearOfConstruction(int yearOfConstruction) {
            this.yearOfConstruction = yearOfConstruction;
            return this;
        }

        public House build() {
            return new House(rooms, height, squareFootage, hasGarden, color, yearOfConstruction);
        }

    }

    @Override
    public String toString() {
        return "House{" +
                "rooms=" + rooms +
                ", height=" + height +
                ", squareFootage=" + squareFootage +
                ", hasGarden=" + hasGarden +
                ", color='" + color + '\'' +
                ", yearOfConstruction=" + yearOfConstruction +
                '}';
    }
}
