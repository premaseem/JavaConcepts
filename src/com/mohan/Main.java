package com.mohan;

/**
 * Created by Mohan on 01/28/2017
 */

public class Main {

public static void main(String[] args) {
		
		Car car = new Car();
		car.setVehicle_type("car");
		car.setVehicle_name("honda");
		car.setNumberOfWheels(4);
		car.setVehicle_color("blue");
		car.setCc(3000);
		car.setNoOfDoors(2);
		car.getDetails();
		car.car_details();
		Truck truck = new Truck();
		truck.setVehicle_type("truck");
		truck.setVehicle_name("Freightliner");
		truck.setNumberOfWheels(12);
		truck.setVehicle_color("red");
		truck.setNoOfAxles(4);
		truck.setTransmisson("Auto and manual");
		truck.getDetails();
		truck.Truck_details();
	
}
}
