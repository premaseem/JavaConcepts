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
public class MultiThreads implements Runnable{
    
    
   
    
        @Override
    public void run() {
    	Thread th = Thread.currentThread();
        System.out.println("Thread started: "+th.getName());
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
        System.out.println("Thread ended: "+th.getName());    
    }
    
    
}
