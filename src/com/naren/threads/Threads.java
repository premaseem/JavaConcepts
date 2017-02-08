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
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyThreads thread1 = new MyThreads();
        Thread t1 = new Thread(thread1);
        t1.start();
        System.out.println();
        
        
//        Thread mt1 = new Thread(new MultiThreads(),"th1");
//        Thread mt2 = new Thread(new MultiThreads(),"th2");
//        Thread mt3 = new Thread(new MultiThreads(),"th3");
//        mt1.start();
//        mt2.start();
//        mt3.start();
        
        
        
        Thread mt4 = new Thread(new MultiThreads(),"th4");
        Thread mt5 = new Thread(new MultiThreads(),"th5");
        Thread mt6 = new Thread(new MultiThreads(),"th6");
        mt4.start();
        try {
            mt4.join();
        } catch (Exception e) {
        }
        
        mt5.start();
        try {
            mt5.join();
        } catch (Exception e) {
        }
        mt6.start();
        try {
            mt6.join();
        } catch (Exception e) {
        }
        
    }
    
    
    
}


