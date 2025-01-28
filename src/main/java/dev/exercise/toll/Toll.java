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

    public void addVehicle(Vehicle v) {
        double peaje = v.calculateToll();
        totalToll += peaje;
        vehicle.add(v);
    }

    public Double getTotalToll() {
        return totalToll;
    }

    public List<Vehicle> getVehicles() { 
        return vehicle;
    }

    public void getReport() {
        System.out.println("Toll Station: " + name + ", City: " + city);
        System.out.println("Registered vehicles:");
        for (Vehicle v : vehicle) {
            System.out.println(" - Plate: " + v.getVehiclePlate() + ", Toll: $" + v.calculateToll());
        }
        System.out.println("Total raised: $" + totalToll);
    }

}
