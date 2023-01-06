package org.example.factory;

public class Car implements Conveyance{
    @Override
    public void deliver() {
        System.out.println("Car deliver");
    }

    @Override
    public double calculateFees(double km) {
        return km * 10;
    }
}
