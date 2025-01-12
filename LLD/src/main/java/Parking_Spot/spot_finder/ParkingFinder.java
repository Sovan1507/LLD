package Parking_Spot.spot_finder;

import Parking_Spot.inventory.ParkingSpot;
import Parking_Spot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public abstract class ParkingFinder implements IParkingSpotFinder {

    List<ParkingSpot> parkingSpots;

    public ParkingFinder() {
        this.parkingSpots = new ArrayList<>();
    }

    @Override
    public ParkingSpot findAndReserve(Vehicle vehicle) {
        Optional<ParkingSpot> first = parkingSpots.stream().filter(parkingSpot -> parkingSpot.isAvailable() && parkingSpot.getVehicleType().equals(vehicle.getVehicleType())).findFirst();
        return first.orElse(null);
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
    }
}
