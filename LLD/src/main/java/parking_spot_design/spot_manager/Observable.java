package parking_spot_design.spot_manager;

import parking_spot_design.ParkingSpot;
import parking_spot_design.spot_finder.Observer;

public interface Observable {
    void notify(ParkingSpot parkingSpot);

    void addObserver(Observer... o);

    void removeObserver(Observer o);

}
