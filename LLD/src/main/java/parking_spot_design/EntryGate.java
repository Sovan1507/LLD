package parking_spot_design;

public class EntryGate {

    ParkingSpotRequestRouter parkingSpotRequestRouter;

    public EntryGate(ParkingSpotRequestRouter parkingSpotRequestRouter) {
        this.parkingSpotRequestRouter = parkingSpotRequestRouter;
    }

    public ParkingSpot findParking(Vehicle vehicle) {
        return parkingSpotRequestRouter.findSpot(vehicle);
    }
}
