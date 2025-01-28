package dev.exercise.toll;

public class Moto extends Vehicle {

    public Moto(String vehicle_plate, double toll_value ) {
        super(vehicle_plate, toll_value);
    }

    @Override
    public double calculateToll() {
        return tollValue;
    }
    
}