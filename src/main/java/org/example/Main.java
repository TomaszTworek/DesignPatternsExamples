package org.example;

import org.example.factory.method.CarTransport;
import org.example.factory.method.ShipTransport;
import org.example.factory.method.TransportFactory;
import org.example.factory.method.TruckTransport;

import java.util.Scanner;

public class Main {

    //TODO: 1. Look at example below and find a problem. What if we want to add new type of transport? Imagine that below logic must be written in different places
    //TODO: 2. Replace it with factory method
    //TODO: 3. Create Abstract class called TransportFactory with abstract method that create Conveyance and normal method deliverProduct() that uses that abstract method and use method deliver()
    //TODO: 4. Create subclasses factories for each of the transport. This classes extends TransportFactory class
    //TODO: 5. Change code in main method. Hint: Create new variable TransportFactory and replace creation of object in if statement

    private static TransportFactory transportFactory;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter kg to transport");
        int kgToTransport = scanner.nextInt();
        System.out.println("Need to cross the sea? (true/false)");
        boolean needToCrossSea = scanner.nextBoolean();

        if (needToCrossSea) {
            transportFactory = new ShipTransport();
        } else if (kgToTransport < 500) {
            transportFactory = new CarTransport();
        } else {
            transportFactory = new TruckTransport();
        }

        transportFactory.deliverProduct();
    }
}