package parking_spot_design.spot_finder;

import parking_spot_design.ParkingSpot;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class ParkingSpotFinder implements Observer {

    List<ParkingSpot> parkingSpots = new ArrayList<>();

    public ParkingSpot find() {
        ParkingSpot parkingSpot1 = parkingSpots.stream().filter(parkingSpot -> parkingSpot.isAvailable()).findFirst().orElse(null);
        if (Objects.nonNull(parkingSpot1)) parkingSpot1.setAvailable(false);
        return parkingSpot1;
    }
}
