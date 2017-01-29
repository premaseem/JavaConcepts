package com.premaseem.variableShadowing;

/**
 * Created by asee2278 on 1/29/17.
 */
public class Client {


    public static void main(String[] args) {

        Vehicle v = new Bike();

        Bike b = new Bike();
        System.out.println(v);

        System.out.println(b);

        Car c = new Car();
        Vehicle car = new Car();

        Vehicle v2 = new Bike();





    }

}
