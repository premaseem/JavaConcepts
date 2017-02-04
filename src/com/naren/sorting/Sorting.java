/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren.sorting;

import java.util.ArrayList;

/**
 *
 * @author Narender Reddy
 */
public class Sorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         
       ArrayList<Integer>  a = new ArrayList<>();
        a.add(2);
        a.add(1);
        a.add(4);
        a.add(6);
        a.add(3);
        System.out.println("Before sorting");
        System.out.println(a);
//        for(Integer i : a){
//            
//            System.out.println(i);
//        }
        
//        System.out.println(a.get(2));
        System.out.println("After sorting");
        
        for(int i = 0; i<a.size();i++){
//          System.out.println(a);
            for(int j = 1;j<a.size();j++){ 
                int temp;
                if(a.get(j-1)>a.get(j)){
                    
                    temp = a.get(j);
                    a.set(j, a.get(j-1));
                    a.set(j-1, temp);
                }
                //System.out.println(a);
            }
        }
       System.out.println(a); 
    }
    
    }  

