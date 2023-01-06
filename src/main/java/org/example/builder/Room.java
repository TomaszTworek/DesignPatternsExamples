package org.example.builder;

import java.util.List;

public class Room {

    private List<Window> windows;

    private Bed bed;

    private double height;

    private double length;

    private double width;

    private RoomType roomType;

    public Room(List<Window> windows, Bed bed, double height, double length, double width, RoomType roomType) {
        this.windows = windows;
        this.bed = bed;
        this.height = height;
        this.length = length;
        this.width = width;
        this.roomType = roomType;
    }
}
