package org.example.factory.method;

import org.example.factory.Conveyance;
import org.example.factory.Ship;

public class ShipTransport extends TransportFactory{
    @Override
    protected Conveyance createConveyance() {
        return new Ship();
    }
}
