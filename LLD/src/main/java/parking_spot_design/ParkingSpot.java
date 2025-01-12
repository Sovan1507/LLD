package parking_spot_design;

public class ParkingSpot {
    String spotId;
    int price;
    VehicleType vehicleType;
    boolean isAvailable = true;

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotId='" + spotId + '\'' +
                ", price=" + price +
                ", vehicleType=" + vehicleType +
                ", isAvailable=" + isAvailable +
                '}';
    }

    public ParkingSpot(String spotId, int price, VehicleType vehicleType) {
        this.spotId = spotId;
        this.price = price;
        this.vehicleType = vehicleType;
    }

    public String getSpotId() {
        return spotId;
    }

    public void setSpotId(String spotId) {
        this.spotId = spotId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}

