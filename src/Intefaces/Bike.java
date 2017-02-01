/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Intefaces;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class Bike implements Vehicle {

    private int cc;
    private String model;
    private String color;

    public Bike(int cc, String model,String color) {
        this.cc = cc;
        this.model = model;
        this.color = color;
    }

    
    @Override
    public String findVehicleType() {
        return "Bike";
    }

    @Override
    public String findGearType() {
        return "Geared";
    }

    @Override
    public int noOfSeats() {
        return 2;
    }

    public int getCc() {
        return cc;
    }

    public String getModel() {
        return model;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public void setModel(String model) {
        this.model = model;
    }

    
    
    @Override
     public String toString() {
        
        return "\nVehicle Type: "+findVehicleType()+"\nModel: "+getModel()+"\nColor: "+getColor(color)+"\nGear Type: "+findGearType()+"\nCC: "+getCc()+"CC";
    }
    
}
