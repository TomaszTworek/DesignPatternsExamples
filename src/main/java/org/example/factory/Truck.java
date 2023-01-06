package org.example.factory;

public class Truck implements Conveyance{
    @Override
    public void deliver() {
        System.out.println("Truck deliver");
    }
}
