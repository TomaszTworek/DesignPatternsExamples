package org.example.factory;

public class Car implements Conveyance{
    @Override
    public void deliver() {
        System.out.println("Car deliver");
    }
}
