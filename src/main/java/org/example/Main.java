package org.example;

import org.example.builder.*;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        House house = House.builder()
                .rooms(Collections.singletonList(
                        Room.builder()
                                .bed(new Bed("IKEA"))
                                .height(300)
                                .length(400)
                                .width(500)
                                .roomType(RoomType.BEDROOM).build()
                ))
                .color("White")
                .hasGarden(true)
                .squareFootage(130)
                .yearOfConstruction(2015)
                .build();

        System.out.println(house);
    }
}