/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren.shapes;

/**
 *
 * @author Narender Reddy
 */
public class Triangle implements Shape{
    private double base;
    private double height;
    int noOfSides = 3;
    
    public String getTriangleSidesDetails(){
        return "Nummber of sides Triangle has= "+noOfSides;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    

    @Override
    public double area() {
     return (getBase()*getHeight())/2;   
    }

    @Override
    public double perimeter() {
        return 10.0;
    }
    
    @Override
    public String toString(){
        return "Area of triangle "+area()+"\nPerimeter of traingle is "+perimeter();
    }
    
}
