package com.premaseem.variableShadowing;

/**
 * Created by asee2278 on 1/29/17.
 */
public class Vehicle extends Object{

    int noOfWheel=4;


    public String stunt(){
        return "Bike stunt";
    }


    @Override
    public String toString() {

        return " vars " + noOfWheel +" "+ getClass().getName();
    }
}
