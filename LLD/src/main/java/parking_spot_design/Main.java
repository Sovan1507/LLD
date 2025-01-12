package parking_spot_design;

import parking_spot_design.spot_finder.*;
import parking_spot_design.spot_manager.ParkingSpotAdder;
import parking_spot_design.spot_manager.ParkingSpotManager;
import parking_spot_design.spot_manager.ParkingSpotManagerRequestHandler;
import parking_spot_design.spot_manager.ParkingSpotRemover;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        ParkingSpotRequestRouter parkingSpotRequestRouter = getParkingSpotRequestRouter();
        EntryGate entryGate = new EntryGate(parkingSpotRequestRouter);

        parkingSpotRequestRouter.addSpot(new ParkingSpot(UUID.randomUUID().toString(), 10, VehicleType.TWO_WHEELER));
        parkingSpotRequestRouter.addSpot(new ParkingSpot(UUID.randomUUID().toString(), 10, VehicleType.TWO_WHEELER));
        parkingSpotRequestRouter.addSpot(new ParkingSpot(UUID.randomUUID().toString(), 10, VehicleType.COMPACT));
        parkingSpotRequestRouter.addSpot(new ParkingSpot(UUID.randomUUID().toString(), 10, VehicleType.LARGE));

        ParkingSpot spot1 = parkingSpotRequestRouter.findSpot(new Vehicle(1234, VehicleType.TWO_WHEELER));
        System.out.println("found spot1 " + spot1);
        ParkingSpot spot2 = parkingSpotRequestRouter.findSpot(new Vehicle(12345, VehicleType.TWO_WHEELER));
        System.out.println("found spot2 " + spot2);
        ParkingSpot spot3 = parkingSpotRequestRouter.findSpot(new Vehicle(12345, VehicleType.TWO_WHEELER));
        System.out.println("found spot3 " + spot3); // return null since we just have 2 spots for 2 wheeler

    }

    private static ParkingSpotRequestRouter getParkingSpotRequestRouter() {
        ParkingSpotFinder twoWheelerParkingSpotFinder = new TwoWheelerParkingSpotFinder();
        ParkingSpotFinder fourWheelerParkingSpotFinder = new FourWheelerParkingSpotFinder();
        ParkingSpotFinderRequestHandler parkingSpotFinderRequestHandler = new ParkingSpotFinderRequestHandler(twoWheelerParkingSpotFinder, fourWheelerParkingSpotFinder);

        ParkingSpotManager parkingSpotRemover = new ParkingSpotRemover();
        ParkingSpotManager parkingSpotAdder = new ParkingSpotAdder();
        parkingSpotAdder.addObserver(twoWheelerParkingSpotFinder, fourWheelerParkingSpotFinder);
        parkingSpotRemover.addObserver(twoWheelerParkingSpotFinder, fourWheelerParkingSpotFinder);

        ParkingSpotManagerRequestHandler parkingSpotManagerRequestHandler = new ParkingSpotManagerRequestHandler(parkingSpotAdder, parkingSpotRemover);

        ParkingSpotRequestRouter parkingSpotRequestRouter = new ParkingSpotRequestRouter(parkingSpotManagerRequestHandler, parkingSpotFinderRequestHandler);
        return parkingSpotRequestRouter;
    }
}
