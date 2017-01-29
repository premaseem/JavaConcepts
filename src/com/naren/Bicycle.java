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
public class Bicycle extends Vehicle{
    
    private boolean gears;

    public Bicycle(boolean gears, String color, double maxSpeed) {
        super(color, maxSpeed);
        this.gears = gears;
    }
    public Bicycle(){
    }

    public void setGears(boolean gears) {
        this.gears = gears;
    }
    
   public String gearDescription(){
       if(gears){
           return "gear feature";
       }
       return "no gear feature";
   }
    @Override
   public String toString(){
       return "The bicycle is "+getColor()+" color and has "+gearDescription();
   }
    
}
