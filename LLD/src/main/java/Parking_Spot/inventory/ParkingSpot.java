package Parking_Spot.inventory;

import Parking_Spot.vehicle.VehicleType;

public class ParkingSpot {
    String id;
    boolean isAvailable = true;
    VehicleType vehicleType;
    SpotMetadata metadata;

    public ParkingSpot(String id, VehicleType vehicleType, SpotMetadata metadata) {
        this.id = id;
        this.vehicleType = vehicleType;
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public SpotMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(SpotMetadata metadata) {
        this.metadata = metadata;
    }
}
