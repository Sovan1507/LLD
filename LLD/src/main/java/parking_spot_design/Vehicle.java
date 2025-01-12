package parking_spot_design;

public class Vehicle {
    int regd_num;
    VehicleType vehicleType;

    public Vehicle(int regd_num, VehicleType vehicleType) {
        this.regd_num = regd_num;
        this.vehicleType = vehicleType;
    }

    public int getRegd_num() {
        return regd_num;
    }

    public void setRegd_num(int regd_num) {
        this.regd_num = regd_num;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
