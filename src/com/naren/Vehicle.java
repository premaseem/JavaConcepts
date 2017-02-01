/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicle;

/**
 *
 * @author Narender Reddy
 */
public class Vehicle {
    private String color;
    private double maxSpeed;

    public Vehicle(String color, double maxSpeed) {
        this.color = color;
        this.maxSpeed = maxSpeed;
    }
    public Vehicle(){
    }
    

    public String getColor() {
        return color;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    
    @Override
    public String toString(){
        return "The vehicle is "+color+" color and " +maxSpeed+ "mph is the max speed the vehicle can move";
    }
    
    
}
