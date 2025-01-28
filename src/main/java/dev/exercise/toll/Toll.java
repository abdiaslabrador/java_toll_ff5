package dev.exercise.toll;

import java.util.ArrayList;
import java.util.List;

public class Toll {
    private String name;
    private String city;
    private Double totalToll;
    private List<Vehicle> vehicle;

    public Toll(String name, String city, Double total_toll) {
        this.name = name;
        this.city = city;
        this.totalToll = totalToll;
        this.vehicle = new ArrayList<>();
    }

    public Double getTotalToll() {
        return totalToll;
    }

}
