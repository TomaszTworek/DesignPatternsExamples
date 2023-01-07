package org.example.factory;

import org.example.factory.strategy.CalculateFeesStrategy;

public class Truck implements Conveyance {

    private CalculateFeesStrategy calculateFeesStrategy;

    public Truck() {
    }

    public Truck(CalculateFeesStrategy calculateFeesStrategy) {
        this.calculateFeesStrategy = calculateFeesStrategy;
    }

    @Override
    public void deliver() {
        System.out.println("Truck deliver");
    }

    @Override
    public double calculateFees(double km) {
        return calculateFeesStrategy.calculate(km);
    }

}
