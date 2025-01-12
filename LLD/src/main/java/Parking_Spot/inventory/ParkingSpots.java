package Parking_Spot.inventory;

import Parking_Spot.spot_finder.Observable;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpots implements Observer {
    private final List<Observable> observables;
    List<ParkingSpot> parkingSpots;

    public ParkingSpots(List<Observable> observables) {
        this.parkingSpots = new ArrayList<>();
        this.observables = observables;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void addParkingSpot(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        notify(parkingSpot);
    }

    @Override
    public void notify(ParkingSpot parkingSpot) {
        observables.forEach(observable -> observable.update(parkingSpot));
    }
}
