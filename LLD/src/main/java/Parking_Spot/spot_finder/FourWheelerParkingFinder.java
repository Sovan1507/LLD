package Parking_Spot.spot_finder;

import Parking_Spot.inventory.ParkingSpot;
import Parking_Spot.vehicle.VehicleType;

public class FourWheelerParkingFinder extends ParkingFinder implements Observable {

    public FourWheelerParkingFinder() {
        super();
    }

    @Override
    public void update(ParkingSpot parkingSpot) {
        if (!parkingSpot.getVehicleType().equals(VehicleType.TWO_WHEELER))
            addParkingSpot(parkingSpot);
    }
}
