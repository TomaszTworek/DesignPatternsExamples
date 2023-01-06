package org.example.builder;

public class Bed {

    private String model;

    private int daysSinceSheetChanges;

    public Bed(String model) {
        this.model = model;
        this.daysSinceSheetChanges = 0;
    }

    public Bed(String model, int daysSinceSheetChanges) {
        this.model = model;
        this.daysSinceSheetChanges = daysSinceSheetChanges;
    }

    @Override
    public String toString() {
        return "Bed{" +
                "model='" + model + '\'' +
                ", daysSinceSheetChanges=" + daysSinceSheetChanges +
                '}';
    }
}
