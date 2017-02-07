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
public interface Vehicle {
    public String findVehicleType();
    public String findGearType();
    public int noOfSeats();
    
    default String getColor(String color){
       return  color;
    }
}
