package org.example.factory.strategy;

public class SeaFeesStrategy implements CalculateFeesStrategy {
    @Override
    public double calculate(double km) {
        return 100 * km;
    }
}
