package com.premaseem.threads;

/**
 * Created by asee2278 on 2/5/17.
 */

class MyThread extends Thread {

//    public void run(){
//
//        System.out.println("thread is running...");
//        System.out.println("Retrieve Medicine details from Database ");
//
//    }

    public static void main(String args[]){

        MyThread t1=new MyThread();
        t1.start();

    }
}


class Vehicle {

}

class Car extends Vehicle implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.print("Take passengers using road ");
    }
}

class AirPlane extends Vehicle implements Runnable {

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        System.out.print("Take passengers using Air ");
    }
}