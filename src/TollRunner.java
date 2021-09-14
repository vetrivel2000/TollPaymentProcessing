import logical.LogicalLayer;
import pojo.Toll;
import pojo.Vehicle;

import java.util.ArrayList;
import java.util.Scanner;

public class TollRunner {
    static LogicalLayer logical= new LogicalLayer();
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no.of tolls");
        int numTolls=scan.nextInt();
        double bikeAmount=5,carAmount=10,truckAmount=15;
        ArrayList<Toll> tolls = new ArrayList<>();
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        for (int i = 0; i <numTolls ; i++) {
            tolls.add(new Toll(bikeAmount,carAmount,truckAmount));
            bikeAmount+=5;
            carAmount+=10;
            truckAmount+=15;
        }
        int option;
        do {
            System.out.println("1.Enter user\n2.DisplayTolls\n3.DisplayVehicles");
            System.out.println("Enter your choice");
            option = scan.nextInt();
            switch (option){
                case 1:
                {
                    System.out.println("Enter vehicle type");
                    String type=scan.next();
                    System.out.println("Enter vehicle number");
                    String number=scan.next();
                    System.out.println("Enter start");
                    char start=scan.next().charAt(0);
                    System.out.println("Enter end");
                    char end=scan.next().charAt(0);
                    int count=0;
                    for (int i = (int)start-'A'; i <=(int)end-'A' ; i++) {
                        count++;
                    }
                    int[] tollNumber= logical.getToll(start,end, tolls,count);
                    double[] amount=logical.getAmount(type,tollNumber,tolls,count);
                    double totalAmount=logical.getTotalAmount(amount);
                    Vehicle vehicle = logical.getVehicleObject(type,number,start,end,tollNumber,amount,totalAmount);
                    vehicles.add(vehicle);
                    logical.getTollObject(vehicles,tolls,tollNumber);
//                    tolls.add(toll);
                    break;
                }
                case 2:
                {
                    for (Toll toll : tolls) {
                        System.out.println(toll);
                    }
                    break;
                }
                case 3:
                {
                    for (Vehicle vehicle : vehicles) {
                        System.out.println(vehicle);
                    }
                    break;
                }
            }
        }while (option<4);
    }
}
