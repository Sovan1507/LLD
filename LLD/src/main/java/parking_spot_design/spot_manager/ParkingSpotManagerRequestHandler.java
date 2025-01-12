package parking_spot_design.spot_manager;

import parking_spot_design.ParkingSpot;

public class ParkingSpotManagerRequestHandler {

    private ParkingSpotManager parkingSpotAdder;
    private ParkingSpotManager parkingSpotRemover;

    public ParkingSpotManagerRequestHandler(ParkingSpotManager parkingSpotAdder, ParkingSpotManager parkingSpotRemover) {
        this.parkingSpotAdder = parkingSpotAdder;
        this.parkingSpotRemover = parkingSpotRemover;
    }

    public void add(ParkingSpot parkingSpot) {
        parkingSpotAdder.add(parkingSpot);
    }

    public void remove(ParkingSpot parkingSpot) {
        parkingSpotRemover.remove(parkingSpot);
    }

}
