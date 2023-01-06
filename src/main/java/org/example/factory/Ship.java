package org.example.factory;

public class Ship implements Conveyance{
    @Override
    public void deliver() {
        System.out.println("Ship deliver");
    }

    @Override
    public double calculateFees(double km) {
        return km * 100;
    }
}
