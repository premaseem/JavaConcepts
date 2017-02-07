/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sphoorthi.Intefaces;

import java.util.Scanner;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class Interface_Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Bike bike;
        Car car;
        String entry="";
         System.out.println("Enter y or Y to continue or any key to exit to continue");
         entry = scan.next();
         if(!(entry.equals("y"))||(entry.equals("Y")))  {
             System.out.println("Thank you, Bye!");
         }         
            
        while((entry.equals("y"))||(entry.equals("Y"))){
            System.out.println("Enter 1 to choose Bike ");
            System.out.println("Enter 2 to choose Car ");
            int choice = scan.nextInt();
            
            switch(choice){
                case 1: 
                    System.out.println("Enter CC of the Bike");
                    int cc = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Model of Bike");
                    String model = scan.nextLine();
                    System.out.println("Enter Color of Bike");
                    String color = scan.nextLine();
                    bike = new Bike(cc,model,color);
                    System.out.println(bike.toString());
                    break;
                case 2:
                    System.out.println("Enter car manufacturer");
                    String make = scan.nextLine();
                    scan.nextLine();
                    System.out.println("Enter car model");
                    String modelCar = scan.nextLine();
                    System.out.println("Enter Year of manufacturer");
                    int year = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter Color of Bike");
                    String colorCar = scan.nextLine();
                    break;
                default:
                    System.out.println("Please choose either 1 or 2");
                    break;
                    
            }
            System.out.println("Enter y or Y to continue or any key to exit to continue");
            entry = scan.next();
            if(!(entry.equals("y"))||(entry.equals("Y")))  {
             System.out.println("Thank you, Bye!");
         }  
            
        }
    }
    
}
