package parking_spot_design.spot_finder;

import parking_spot_design.ParkingSpot;

public interface Observer {
    void add(ParkingSpot parkingSpot);
    void remove(ParkingSpot parkingSpot);
}
