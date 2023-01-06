package org.example.builder;

import java.util.List;

public class Room {

    private List<Window> windows;

    private Bed bed;

    private double height;

    private double length;

    private double width;

    private RoomType roomType;

    private Room(List<Window> windows, Bed bed, double height, double length, double width, RoomType roomType) {
        this.windows = windows;
        this.bed = bed;
        this.height = height;
        this.length = length;
        this.width = width;
        this.roomType = roomType;
    }

    public static RoomBuilder builder() {
        return new RoomBuilder();
    }

    public static class RoomBuilder {

        private List<Window> windows;

        private Bed bed;

        private double height;

        private double length;

        private double width;

        private RoomType roomType;

        public RoomBuilder windows(List<Window> windows) {
            this.windows = windows;
            return this;
        }

        public RoomBuilder bed(Bed bed) {
            this.bed = bed;
            return this;
        }

        public RoomBuilder height(double height) {
            this.height = height;
            return this;
        }

        public RoomBuilder length(double length) {
            this.length = length;
            return this;
        }

        public RoomBuilder width(double width) {
            this.width = width;
            return this;
        }

        public RoomBuilder roomType(RoomType roomType) {
            this.roomType = roomType;
            return this;
        }

        public Room build() {
            return new Room(windows, bed, height, length, width, roomType);
        }
    }

    @Override
    public String toString() {
        return "Room{" +
                "windows=" + windows +
                ", bed=" + bed +
                ", height=" + height +
                ", length=" + length +
                ", width=" + width +
                ", roomType=" + roomType +
                '}';
    }
}
