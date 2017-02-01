package com.mohan;

public class Truck extends Vehicle {
	
	private int NoOfAxles;
	private String Transmisson;
	
	public int getNoOfAxles() {
		return NoOfAxles;
	}
	public void setNoOfAxles(int noOfAxles) {
		NoOfAxles = noOfAxles;
	}
	public String getTransmisson() {
		return Transmisson;
	}
	public void setTransmisson(String transmisson) {
		Transmisson = transmisson;
	}
	public void Truck_details(){
		
		System.out.println("No of Axles "+NoOfAxles);
		System.out.println("type of Transmisson is "+Transmisson);
		
	}

}
