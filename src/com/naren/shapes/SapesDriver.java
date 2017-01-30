/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren.shapes;

import java.util.Scanner;

/**
 *
 * @author Narender Reddy
 */
public class SapesDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        int proceed = 1;
        while(proceed ==1){
            System.out.println("Enter 11 to find the area and perimeter of rectangle");
            System.out.println("Enter 22 to find the area and perimeter of triangle");
            System.out.println("Enter 33 to find the area and perimeter of circle");
            
            int keyEntered = scanner.nextInt();
            if(keyEntered == 11){
                System.out.println("Enter breadth of Rectangle: ");
                double b = scanner.nextDouble();
                System.out.println("Enter length of Rectangle: ");
                double l = scanner.nextDouble();
                Rectangle rectangle = new Rectangle();
                rectangle.setBreadth(b);
                rectangle.setLength(l);
                System.out.println(rectangle.getRectangleSidesDetails());
                System.out.println(rectangle.toString());
            }else if(keyEntered == 22){
                System.out.println("Enter Base of the Traingle: ");
                double b = scanner.nextDouble();
                 System.out.println("Enter Base of the Traingle: ");
                double h = scanner.nextDouble();
                Triangle triangle = new Triangle();
                triangle.setBase(b);
                triangle.setHeight(h);
                System.out.println(triangle.getTriangleSidesDetails());
                System.out.println(triangle.toString());
            }else if(keyEntered == 33){
                System.out.println("Enter radius of circle: ");
                double r = scanner.nextDouble();
                Circle circle = new Circle();
                circle.setRadius(r);
                System.out.println(circle.toString());
            }
            System.out.println("Enter 1 to continue and any key to exit ");
                keyEntered = scanner.nextInt();
                if(keyEntered == 1){
                    proceed = keyEntered;
                }
                else{
                    proceed = keyEntered;
                    System.out.println("bye");
                }
            
            
        }
    }
    
}
