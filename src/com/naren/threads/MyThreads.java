/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren.threads;

/**
 *
 * @author Narender Reddy
 */
public class MyThreads implements Runnable{

   

        @Override
        public void run() {
            try {
                for(int i =0; i<5; i++){
                    System.out.println(i);
                }
                
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
    }
