package com.mohan;

public class Car extends Vehicle {
	
	private int NoOfDoors;
	private int cc;
	
	public int getNoOfDoors() {
		return NoOfDoors;
	}
	public void setNoOfDoors(int noOfDoors) {
		NoOfDoors = noOfDoors;
	}
	public int getCc() {
		return cc;
	}
	public void setCc(int cc) {
		this.cc = cc;
	}
	 public void car_details(){
		 
		 System.out.println("No of doors "+NoOfDoors);
		 System.out.println("Capacity of Car "+cc+"CC");
	 }
	
	
	


}
