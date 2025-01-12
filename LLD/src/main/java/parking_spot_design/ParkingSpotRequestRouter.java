package parking_spot_design;

import parking_spot_design.spot_finder.ParkingSpotFinderRequestHandler;
import parking_spot_design.spot_manager.ParkingSpotManagerRequestHandler;

public class ParkingSpotRequestRouter {

    ParkingSpotManagerRequestHandler parkingSpotManagerRequestHandler;
    ParkingSpotFinderRequestHandler parkingSpotFinderRequestHandler;

    public ParkingSpotRequestRouter(ParkingSpotManagerRequestHandler parkingSpotManagerRequestHandler, ParkingSpotFinderRequestHandler parkingSpotFinderRequestHandler) {
        this.parkingSpotManagerRequestHandler = parkingSpotManagerRequestHandler;
        this.parkingSpotFinderRequestHandler = parkingSpotFinderRequestHandler;
    }

    public ParkingSpot findSpot(Vehicle vehicle) {
        return parkingSpotFinderRequestHandler.find(vehicle);
    }

    public void addSpot(ParkingSpot parkingSpot) {
        parkingSpotManagerRequestHandler.add(parkingSpot);
    }
}
