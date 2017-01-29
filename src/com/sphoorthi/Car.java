/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sphoorthi;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class Car extends Vehicle{
    private String carMake;
    private String carModel;
    private int carYear;

    public Car() {
    }

    public Car(String carMake, String carModel, int carYear, String color, int doorsCount) {
        super(color, doorsCount);
        this.carMake = carMake;
        this.carModel = carModel;
        this.carYear = carYear;
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
        
        return "\nVehicle Type: Car"+"\nCar Manufacturer: "+getCarMake()+"\nCar Model: "
                +getCarModel()+"\nCar Model Year: "+getCarYear()+super.toString();
    }
    
     
    
}
