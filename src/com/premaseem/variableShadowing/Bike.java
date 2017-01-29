package com.premaseem.variableShadowing;

/**
 * Created by asee2278 on 1/29/17.
 */
public class Bike extends Vehicle{

    int noOfWheel = 2;

    public String villy(){
        return "Bike stunt";
    }


    @Override
    public String toString() {

        return " vars " + this.noOfWheel +" "+ getClass().getName();
    }


}
