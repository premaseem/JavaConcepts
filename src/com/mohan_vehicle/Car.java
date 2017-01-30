package com.mohan_vehicle;

public class Car implements Vehicle{

	@Override
	public String getVehicleType() {
		// TODO Auto-generated method stub
		return "Car";
	}

	@Override
	public String getVehicleName() {
		// TODO Auto-generated method stub
		return "Honda";
	}

	@Override
	public Integer getNumberOfSeats() {
		// TODO Auto-generated method stub
		return 2;
	}

	@Override
	public Integer getNumberOfWheels() {
		// TODO Auto-generated method stub
		return 4;
	}
	
	

}
