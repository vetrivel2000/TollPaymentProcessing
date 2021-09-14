package logical;

import pojo.Toll;
import pojo.Vehicle;

import java.util.ArrayList;

public class LogicalLayer {
    static double totalAmount=0;
    public Vehicle getVehicleObject(String type,String number,char start,char end,int[] tollNumber,double[] amount,double totalAmount)
    {
        Vehicle object = new Vehicle();
        object.setType(type);
        object.setVehicleNumber(number);
        object.setStart(start);
        object.setEnd(end);
        object.setTollNumber(tollNumber);
        object.setAmount(amount);
        object.setTotalAmount(totalAmount);
        return object;
    }
    public int[] getToll(char start,char end,ArrayList<Toll> tolls,int size)
    {
        int[] tollNumbers = new int[size];
        int j=0;
        for (int i = (int)start-'A'; i <=(int)end-'A' ; i++) {
            tollNumbers[j]=i;
            j++;
        }
        return tollNumbers;
    }
    public void getTollObject(ArrayList<Vehicle> vehicle,ArrayList<Toll> tolls,int[] tollNumber)
    {
        for (int i = 0; i <tollNumber.length ; i++) {
            Toll toll= tolls.get(tollNumber[i]);
            toll.setVehicles(vehicle);
        }
    }
    public double[] getAmount(String type, int[] tollNumber, ArrayList<Toll> tolls,int size)
    {
        double[] amount= new double[size];
        for (int i = 0; i < tollNumber.length ; i++) {
            Toll toll= tolls.get(tollNumber[i]);
            double bikeAmount=toll.getBikeAmount();
            double carAmount=toll.getCarAmount();
            double truckAmount=toll.getTruckAmount();
            if(type.equals("car"))
            {
                amount[i]=carAmount;
            }
            else if(type.equals("bike"))
            {
                amount[i]=bikeAmount;
            }
            else
            {
                amount[i]=truckAmount;
            }
        }
        return amount;
    }
    public double getTotalAmount(double[] amount)
    {
        for (int i = 0; i <amount.length ; i++) {
            totalAmount+=amount[i];
        }
        return totalAmount;
    }
}
