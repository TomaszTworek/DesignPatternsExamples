package org.example.factory.strategy;

public class LandFeesStrategy implements CalculateFeesStrategy {
    @Override
    public double calculate(double km) {
        return km * 10;
    }
}
