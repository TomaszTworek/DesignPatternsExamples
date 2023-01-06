package org.example;

import org.example.singleton.Government;

public class Main {
    public static void main(String[] args) {

        Government government = Government.getInstance();
        government.increaseTaxes(0.05);

        System.out.println(government.getTaxes());

        Government government2 = Government.getInstance();
        government2.increaseTaxes(0.05);

        System.out.println(government2.getTaxes());
    }
}