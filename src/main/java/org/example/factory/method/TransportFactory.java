package org.example.factory.method;

import org.example.factory.Conveyance;

public abstract class TransportFactory {

    public void deliverProduct() {
        Conveyance conveyance = createConveyance();
        conveyance.deliver();
    }

    protected abstract Conveyance createConveyance();
}
