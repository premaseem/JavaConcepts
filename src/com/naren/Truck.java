/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren;

/**
 *
 * @author Narender Reddy
 */
public class Truck extends Vehicle {
    private double capacity;
    private double mileage;

    public Truck(double capacity, double mileage, String color, double maxSpeed) {
        super(color,maxSpeed);
        this.capacity = capacity;
        this.mileage = mileage;
        
    }
    public Truck(){
        
    }

    public double getCapacity() {
        return capacity;
    }

    public double getMileage() {
        return mileage;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }
    
    @Override
    public String toString(){
        return "The "+getColor()+" truck " + capacity+ " tons per load capacity and has "+mileage+ "mph mileage";
    }
    
    
}
