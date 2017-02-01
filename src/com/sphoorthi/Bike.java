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
public class Bike extends Vehicle{
    private boolean gears;
    private int cc;

    public Bike() {
    }

    public Bike(boolean gears, int cc, String color, int doorsCount) {
        super(color);
        this.gears = gears;
        this.cc = cc;
    }

    public String typeOfBike() {
        String st= "";
        if(gears==true){
            st+= "It has Gears";
        }
        else{
           st+= "It is gearless"; 
        }
        return st;
    }

    public int getCc() {
        return cc;
    }

    public void setGears(boolean gears) {
        this.gears = gears;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    @Override
    public String toString() {
        
        return "\nVehicle Type: Bike"+"\nColor: "+super.getColor()+"\nType: "+typeOfBike()+"\nCC: "+getCc()+"CC";
    }
    
    
    
}
