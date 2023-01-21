package com.driver;

public class Boat implements WaterVehicle {
    String VehicleName;
    int VehicleCapacity;
    public Boat(String name, int capacity){
        this.VehicleName = name;
        this.VehicleCapacity = capacity;
    }

    @Override
    public int getVehicleCapacity() {
        return VehicleCapacity;
    }

    @Override
    public String getVehicleName() {
        return VehicleName;
    }
}
