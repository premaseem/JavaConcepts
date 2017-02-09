package com.mohan;

/**
 * Created by mohan on 08-02-2017.
 */
public class ExceptionExample {

    public static void main(String args[]) {
        ExceptionHandling excep = new ExceptionHandling();
        excep.arithException();
        excep.arrayException();
        excep.numberFormatException();
        excep.stringException();
        excep.nullException();
        excep.ownException(0,20);

    }

}
