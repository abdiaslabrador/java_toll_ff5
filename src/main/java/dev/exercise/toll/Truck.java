package dev.exercise.toll;

public class Truck extends Vehicle{
    private int numberAachAxis;

    public Truck(String vehicle_plate, double tollValue, int numberAachAxis) {
        super(vehicle_plate, tollValue);
        this.numberAachAxis = numberAachAxis;
    }
    
    @Override
    public double calculateToll() {
        return  (tollValue * numberAachAxis);
    }
}
