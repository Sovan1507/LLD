package parking_spot_design.spot_finder;

import parking_spot_design.ParkingSpot;
import parking_spot_design.VehicleType;

public class TwoWheelerParkingSpotFinder extends ParkingSpotFinder {


    @Override
    public void add(ParkingSpot parkingSpot) {
        if (parkingSpot.getVehicleType().equals(VehicleType.TWO_WHEELER)) {
            parkingSpots.add(parkingSpot);
            System.out.println("adding spot:" + parkingSpot);
        }
    }

    @Override
    public void remove(ParkingSpot parkingSpot) {
        if (parkingSpot.getVehicleType().equals(VehicleType.TWO_WHEELER) && parkingSpots.contains(parkingSpot)) {
            parkingSpots.remove(parkingSpot);
            System.out.println("removing spot:" + parkingSpot);
        }
    }
}
