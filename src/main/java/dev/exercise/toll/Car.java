package dev.exercise.toll;

public class Car extends Vehicle {

    public Car(String vehicle_plate, double toll_value) {
        super(vehicle_plate, toll_value);
    }

    @Override
    public double calculateToll() {
        return tollValue;
    }
    
}
