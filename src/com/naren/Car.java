package com.naren;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Narender Reddy
 */
public class Car {
    private String carColor;
    private int doors;
    private double carPrice;
    private String carMake;
    private String carModel;

    public Car(String carColor, double carPrice, String carMake, String carModel) {
        this.carColor = carColor;
        this.carPrice = carPrice;
        this.carMake = carMake;
        this.carModel = carModel;
    }

    public int getDoors() {
        return doors;
    }

   public double mileage(){
       return 0.0;
   }

    @Override
    public String toString(){
        return "Naren brought "+carColor+" color "+carMake+" "+carModel+" for $"+carPrice;

    }

}
