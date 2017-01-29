package com.mohan;

/**
 * Created by Mohan on 01/28/2017
 */
public class Vehicle {
	private String vehicle_type;
	private String vehicle_name;
	private String vehicle_color;
	private int NumberOfWheels;
	
	public String getVehicle_type() {
		return vehicle_type;
	}
	public void setVehicle_type(String vehicle_type) {
		this.vehicle_type = vehicle_type;
	}
	
	
	public String getVehicle_name() {
		return vehicle_name;
	}
	public void setVehicle_name(String vehicle_name) {
		this.vehicle_name = vehicle_name;
	}
	public String getVehicle_color() {
		return vehicle_color;
	}
	public void setVehicle_color(String vehicle_color) {
		this.vehicle_color = vehicle_color;
	}
	public int getNumberOfWheels() {
		return NumberOfWheels;
	}
	public void setNumberOfWheels(int numberOfWheels) {
		NumberOfWheels = numberOfWheels;
	}
	
	public void getDetails (){
		
		System.out.println("Vehicle Type is "+vehicle_type + " Vehicle company is " +vehicle_name + " with  " +NumberOfWheels + " wheels and  color of vehicle is " +vehicle_color);
	}
	
	
	
}