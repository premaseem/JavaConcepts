/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sphoorthi.Intefaces;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class Car implements Vehicle{
    
    private String carMake;
    private String carModel;
    private int carYear;
    private String color;

    public Car(String carMake, String carModel, int carYear,String color) {
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
        this.color = color;
    }
    
    
    
    @Override
    public String findVehicleType() {
        return "Car";
    }

    @Override
    public String findGearType() {
        return "Gearless";
    }

    @Override
    public int noOfSeats() {
        return 4;
    }

    public String getCarMake() {
        return carMake;
    }

    public String getCarModel() {
        return carModel;
    }

    public int getCarYear() {
        return carYear;
    }

    public void setCarMake(String carMake) {
        this.carMake = carMake;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public void setCarYear(int carYear) {
        this.carYear = carYear;
    }
    
    @Override
     public String toString() {
        
        return "\nVehicle Type: "+findVehicleType()+"\nCar Manufacturer: "+getCarMake()+"\nCar Model: "
                +getCarModel()+"\nCar Model Year: "+getCarYear()+"\nGear Type: "+findGearType()+"Color: "+getColor(color);
    }
}
