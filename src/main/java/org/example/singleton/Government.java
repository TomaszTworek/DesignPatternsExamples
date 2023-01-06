package org.example.singleton;

public class Government {

    private double taxes = 100;
    private static Government instance;

    private Government() {
    }

    public static Government getInstance() {
        if (instance == null) {
            instance = new Government();
        }
        return instance;
    }

    public void increaseTaxes(double value) {
        taxes += (taxes * value);
    }

    public double getTaxes() {
        return taxes;
    }
}
