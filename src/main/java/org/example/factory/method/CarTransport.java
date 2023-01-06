package org.example.factory.method;

import org.example.factory.Car;
import org.example.factory.Conveyance;

public class CarTransport extends TransportFactory {
    @Override
    protected Conveyance createConveyance() {
        return new Car();
    }
}
