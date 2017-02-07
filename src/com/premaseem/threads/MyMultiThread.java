package com.premaseem.threads;

/**
 * Created by asee2278 on 2/6/17.
 */


// This is job for Data migration
class Job implements Runnable{

    @Override
    public void run() {
        System.out.println("copy from a ");
        System.out.println("paste in b ");
    }
}

public class MyMultiThread {


    public static void main(String args[]){
        Thread t1 =new Thread(new Job());
        Thread t2 =new Thread(new Job());

        t1.start();
        t2.start();

    }
}