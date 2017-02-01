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
public class Vehicle {
    protected String color;
    protected int doorsCount;

    public Vehicle() {
    }
    
    public Vehicle(String color,int doorsCount){
        this.color = color;
        this.doorsCount = doorsCount;
    }

    public Vehicle(String color) {
        this.color = color;
    }
    
    
    public String getColor() {
        return color;
    }

    public int getDoorsCount() {
        return doorsCount;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoorsCount(int doorsCount) {
        this.doorsCount = doorsCount;
    }

    @Override
    public String toString() {
        return "\nColor: "+getColor()+"\nNumber of Doors: "+getDoorsCount(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
