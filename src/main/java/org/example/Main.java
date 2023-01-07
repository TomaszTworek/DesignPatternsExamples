package org.example;

import org.example.factory.Car;
import org.example.factory.Conveyance;
import org.example.factory.strategy.LandFeesStrategy;

public class Main {

    public static void main(String[] args) {
        LandFeesStrategy landFeesStrategy = new LandFeesStrategy();
        Conveyance car = new Car(landFeesStrategy);
        System.out.println(car.calculateFees(200));
    }
}