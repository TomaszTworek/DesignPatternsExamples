package org.example;

import org.example.factory.Car;
import org.example.factory.Conveyance;
import org.example.factory.method.TransportFactory;

public class Main {

    //TODO: 1. Look at change in Conveyance class. There is new method in this class and have same implementation for car and truck, because
    //TODO: in our case way count fees as see route fees and land road fees.
    //TODO: 2. Think what if we have other means of transport that have same algorithm that count fees.
    //TODO: 3. Create strategy pattern for LandFees and SeeFees.
    //TODO: 4. When creating a car in below example give this strategy in constructor

    private static TransportFactory transportFactory;

    public static void main(String[] args) {

        Conveyance car = new Car();
    }
}