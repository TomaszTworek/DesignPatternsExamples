package org.example.factory;

import org.example.factory.strategy.CalculateFeesStrategy;
import org.example.factory.strategy.LandFeesStrategy;

public class Car implements Conveyance {

    public Car() {
    }

    private CalculateFeesStrategy calculateFeesStrategy;

    public Car(LandFeesStrategy landFeesStrategy) {
        this.calculateFeesStrategy = landFeesStrategy;
    }

    @Override
    public void deliver() {
        System.out.println("Car deliver");
    }

    @Override
    public double calculateFees(double km) {
       return calculateFeesStrategy.calculate(km);
    }


}
