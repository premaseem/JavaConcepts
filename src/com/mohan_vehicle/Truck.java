package com.mohan_vehicle;

public class Truck implements Vehicle {

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return "Truck";
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return "Freightlinear";
	}

	@Override
	public Integer getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 4;
	}

	@Override
	public Integer getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 12;
	}
	

}
