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
public class Rectangle implements Shape{
    private double length;
    private double breadth;
    int noOfSides = 4;

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }
    
    public String getRectangleSidesDetails(){
        return "Number of sides a rectangle has = "+noOfSides;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    @Override
    public double area() {
        return getBreadth()*getLength();
    }

    @Override
    public double perimeter() {
        return (getLength()+getBreadth())*2;
    }
    
    @Override
    public String toString(){
       return "Area of rectangle "+area()+"\nPerimeter of rectangle"+perimeter();
    }
    
    
}
