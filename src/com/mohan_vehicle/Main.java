package com.mohan_vehicle;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
	     int check = 1;
	     while (check == 1) {
		System.out.println("Welcome to the Details of Vehicles");
		System.out.println("press 11 to get the details of Car");
		System.out.println("press 12 to get the details of Truck");
		 int userInput = scan.nextInt();

         if(userInput == 11){
        	 System.out.println("Car details are here");
        	 Car mycar = new Car();
     		System.out.println("Vehicle Type is "+mycar.getVehicleType()+" name is "+
     		mycar.getVehicleName()+" and has " +mycar.getNumberOfWheels()+ " wheels and "+
     				mycar.getNumberOfSeats()+" seats");
         }else if(userInput == 12){
        	 System.out.println("Truck details are here");
        	 Truck mytruck = new Truck();
     		System.out.println( "Vehicle Type is "+mytruck.getVehicleType()+" name is "+
     		mytruck.getVehicleName()+" and has " +mytruck.getNumberOfWheels()+ " wheels and "+
     				mytruck.getNumberOfSeats()+" seats");
         }else {
                System.out.println("Invalid Entry ");
            }
         System.out.println("Do you want to Re-run this program - Press 1 for yes and 0 or other digits to EXIT ");
         try {
             check = scan.nextInt();
         } catch (Exception e) {
             check = 0;
         }
     		
       } 
	    	 
    }
			
}


