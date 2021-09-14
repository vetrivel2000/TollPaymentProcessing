package pojo;

import java.util.ArrayList;

public class Toll {
    private double bikeAmount;
    private double carAmount;
    private double truckAmount;
    private ArrayList<Vehicle> vehicles = new ArrayList<>();


    public Toll(double bikeAmount, double carAmount, double truckAmount) {
        this.bikeAmount = bikeAmount;
        this.carAmount = carAmount;
        this.truckAmount = truckAmount;
    }

    public double getBikeAmount() {
        return bikeAmount;
    }

    public void setBikeAmount(double bikeAmount) {
        this.bikeAmount = bikeAmount;
    }

    public double getCarAmount() {
        return carAmount;
    }

    public void setCarAmount(double carAmount) {
        this.carAmount = carAmount;
    }

    public double getTruckAmount() {
        return truckAmount;
    }

    public void setTruckAmount(double truckAmount) {
        this.truckAmount = truckAmount;
    }

    public ArrayList<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(ArrayList<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    @Override
    public String toString() {
        return "Toll{" +
                "bikeAmount=" + bikeAmount +
                ", carAmount=" + carAmount +
                ", truckAmount=" + truckAmount +
                ", vehicles=" + vehicles +
                '}';
    }
}
