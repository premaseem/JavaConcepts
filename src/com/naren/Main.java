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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Bicycle bicycle = new Bicycle();
        bicycle.setGears(true);
        bicycle.setColor("Black and White");
        bicycle.setMaxSpeed(15);
        System.out.println(bicycle.toString());
        
        Truck truck = new Truck();
        truck.setCapacity(1000);
        truck.setColor("Red");
        truck.setMileage(30);
        System.out.println(truck.toString());
    }
    
}
