package org.example.factory.method;

import org.example.factory.Conveyance;
import org.example.factory.Truck;

public class TruckTransport extends TransportFactory {
    @Override
    protected Conveyance createConveyance() {
        return new Truck();
    }
}
