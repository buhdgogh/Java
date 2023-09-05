package com.homework_.homework06;

public class VehicleFactory {
    private static Horse horse = new Horse();
    private VehicleFactory() {}

    public static Horse getHouse() {
        return horse;
    }

    public static Boat getBoat() {
        return new Boat();
    }

    public static Plane getPlane() {
        return new Plane();
    }
}
