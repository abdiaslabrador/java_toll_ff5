package dev.exercise.toll;

public abstract class Vehicle {

    protected  String vehiclePlate;
    protected  double tollValue;

    public Vehicle(String vehiclePlate, double tollValue) {
        this.vehiclePlate = vehiclePlate;
        this.tollValue = tollValue;
    }

    public abstract double calculateToll();

    public String getVehiclePlate() {
        return vehiclePlate;
    }

}
