package Parking_Spot.ticket;

import Parking_Spot.inventory.ParkingSpot;
import Parking_Spot.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private String id;
    private ParkingSpot parkingSpot;
    private LocalDateTime entryTime;
    private LocalDateTime exitTime;
    private Vehicle vehicle;

    public Ticket(String id, ParkingSpot parkingSpot, LocalDateTime entryTime, LocalDateTime exitTime, Vehicle vehicle) {
        this.id = id;
        this.parkingSpot = parkingSpot;
        this.entryTime = entryTime;
        this.exitTime = exitTime;
        this.vehicle = vehicle;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public LocalDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(LocalDateTime exitTime) {
        this.exitTime = exitTime;
    }
}
