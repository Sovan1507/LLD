package parking_spot_design.spot_manager;


import parking_spot_design.ParkingSpot;
import parking_spot_design.spot_finder.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class ParkingSpotManager implements Observable {

    List<ParkingSpot> parkingSpots;
    List<Observer> observers;

    public ParkingSpotManager() {
        this.parkingSpots = new ArrayList<>();
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer... o) {
        for (Observer o1 : o) observers.add(o1);
    }

    public void removeObserver(Observer o) {
        if (observers.contains(o)) observers.remove(o);
    }

    public void add(ParkingSpot parkingSpot) {
        parkingSpots.add(parkingSpot);
        notify(parkingSpot);
    }

    public void remove(ParkingSpot parkingSpot) {
        parkingSpots.remove(parkingSpot);
        notify(parkingSpot);
    }
}
