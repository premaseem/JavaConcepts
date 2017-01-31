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
public class VehicleDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       Bike bike = new Bike();
       bike.setColor("Black");
       bike.setGears(true);
       bike.setCc(1200);
        System.out.println(bike.toString());
       
       Car car = new Car();
       car.setColor("Blue");
       car.setDoorsCount(2);
       car.setCarMake("Mercury");
       car.setCarModel("Sable");
       car.setCarYear(2001);
       System.out.println(car.toString());
       
    }
    
}
