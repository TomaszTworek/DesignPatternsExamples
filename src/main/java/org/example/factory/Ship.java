package org.example.factory;

import org.example.factory.strategy.CalculateFeesStrategy;

public class Ship implements Conveyance {

    private CalculateFeesStrategy calculateFeesStrategy;

    public Ship() {
    }

    public Ship(CalculateFeesStrategy calculateFeesStrategy) {
        this.calculateFeesStrategy = calculateFeesStrategy;
    }

    @Override
    public void deliver() {
        System.out.println("Ship deliver");
    }

    @Override
    public double calculateFees(double km) {
        return calculateFeesStrategy.calculate(km);
    }

}
