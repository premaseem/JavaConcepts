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
public class Circle implements Shape{
    private double radius;
    public static final double PI = 3.14;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
    
    
    @Override
    public double area() {
        return (PI*getRadius()*getRadius());
    }

    @Override
    public double perimeter() {
        return (2*PI*getRadius());
    }
    
    @Override
    public String toString(){
      return "Area of circle is "+area()+"\n Perimeter of cirlce is "+perimeter();  
    }
}
