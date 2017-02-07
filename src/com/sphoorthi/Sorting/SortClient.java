/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sphoorthi.Sorting;

import java.util.*;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class SortClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(11);
        arraylist.add(2);
        arraylist.add(7);
        arraylist.add(3);

        System.out.println(arraylist);

        System.out.println("Sorting with using sort");
        Collections.sort(arraylist);
        System.out.println(arraylist);
        
        arraylist.clear();
        System.out.println("Added new numbers to arraylist");
        arraylist.add(7);
        arraylist.add(12);
        arraylist.add(5);
        arraylist.add(3);
        System.out.println(arraylist);
        System.out.println("Sorting without using sort method");
        for (int i = 0; i < arraylist.size(); i++) {
            for (int j = arraylist.size() - 1; j > i; j--) {
                if (arraylist.get(i) > arraylist.get(j)) {
                    int tmp = arraylist.get(i);
                    arraylist.set(i, arraylist.get(j));
                    arraylist.set(j, tmp);
               }
            }
        }
        
        System.out.println(arraylist);

    }

}
