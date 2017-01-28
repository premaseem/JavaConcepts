package com.naren;

/**
 * Created by asee2278 on 1/25/17.
 */
public class CarMain {

    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter car color: ");
        String color = sc.next();
        System.out.println("Enter car price: ");
        double price = sc.nextDouble();
        System.out.println("Enter car company: ");
        String make = sc.next();
        System.out.println("Enter car model: ");
        String model = sc.next();

        Car car = new Car(color,price,make,model);

        System.out.println(car);
    }
}
