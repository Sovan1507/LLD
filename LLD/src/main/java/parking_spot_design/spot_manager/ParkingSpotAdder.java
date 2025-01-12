package parking_spot_design.spot_manager;

import parking_spot_design.ParkingSpot;

public class ParkingSpotAdder extends ParkingSpotManager {

    @Override
    public void notify(ParkingSpot parkingSpot) {
        observers.forEach(observer -> observer.add(parkingSpot));
    }
}
