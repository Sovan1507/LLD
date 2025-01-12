package parking_spot_design.spot_finder;

import parking_spot_design.ParkingSpot;
import parking_spot_design.Vehicle;
import parking_spot_design.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class ParkingSpotFinderRequestHandler {

    private Map<VehicleType, ParkingSpotFinder> vehicleTypeParkingSpotFinderMap;

    public ParkingSpotFinderRequestHandler(ParkingSpotFinder twoWheelerFinder, ParkingSpotFinder fourWheelerFinder) {
        vehicleTypeParkingSpotFinderMap = new HashMap<>();
        vehicleTypeParkingSpotFinderMap.put(VehicleType.TWO_WHEELER, twoWheelerFinder);
        vehicleTypeParkingSpotFinderMap.put(VehicleType.COMPACT, fourWheelerFinder);
        vehicleTypeParkingSpotFinderMap.put(VehicleType.LARGE, fourWheelerFinder);
    }

    public ParkingSpot find(Vehicle vehicle) {
        return vehicleTypeParkingSpotFinderMap.get(vehicle.getVehicleType()).find();
    }
}
