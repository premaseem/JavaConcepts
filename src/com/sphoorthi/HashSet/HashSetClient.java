/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sphoorthi.HashSet;

import java.util.*;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class HashSetClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       HashSet<String> hash = new HashSet<String>();
       HashSet<String> hash1 = new HashSet<String>();
      
       
       hash.add("Sphoo");
       hash.add("Nari");
       hash.add("Sree");
       hash.add("Suren");
       hash.add("Sphoo");
        hash1=(HashSet < String >)hash.clone();
        System.out.println(hash1);
       Iterator it = hash.iterator();
        while(it.hasNext()){
            System.out.print(it.next()+" ");
        }
        System.out.println("\n"+hash.contains("Sure"));
        System.out.println(hash.remove("Sphoo"));
        
        System.out.println(hash);
        hash1.clear();
        System.out.println(hash1);
    }
   
}
