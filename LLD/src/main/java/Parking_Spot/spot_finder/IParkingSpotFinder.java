package Parking_Spot.spot_finder;

import Parking_Spot.inventory.ParkingSpot;
import Parking_Spot.vehicle.Vehicle;

public interface IParkingSpotFinder {

    ParkingSpot findAndReserve(Vehicle vehicle);
}
