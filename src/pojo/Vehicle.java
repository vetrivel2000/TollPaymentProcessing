package pojo;

import java.util.Arrays;

public class Vehicle {
    private String type;
    private String vehicleNumber;
    char Start;
    char end;
    int[] tollNumber;
    double[] amount;
    double totalAmount;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public char getStart() {
        return Start;
    }

    public void setStart(char start) {
        Start = start;
    }

    public char getEnd() {
        return end;
    }

    public void setEnd(char end) {
        this.end = end;
    }

    public int[] getTollNumber() {
        return tollNumber;
    }

    public void setTollNumber(int[] tollNumber) {
        this.tollNumber = tollNumber;
    }

    public double[] getAmount() {
        return amount;
    }

    public void setAmount(double[] amount) {
        this.amount = amount;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "type='" + type + '\'' +
                ", vehicleNumber='" + vehicleNumber + '\'' +
                ", Start=" + Start +
                ", end=" + end +
                ", tollNumber=" + Arrays.toString(tollNumber) +
                ", amount=" + Arrays.toString(amount) +
                ", totalAmount=" + totalAmount +
                '}';
    }
}
