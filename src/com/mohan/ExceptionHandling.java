package com.mohan;

/**
 * Created by mohan on 08-02-2017.
 */
public class ExceptionHandling {
    public void arithException()
        {
            try{
                int num1=30, num2=0;
                int output=num1/num2;
                System.out.println ("Result = " +output);
            }
            catch(ArithmeticException e){
                System.out.println ("Arithmetic Exception: You can't divide an integer by 0");
            }
        }

    public void arrayException(){
        try{
            int a[]=new int[10];
            //Array has only 10 elements
            a[11] = 9;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println ("ArrayIndexOutOfBounds");
        }
    }
    public void numberFormatException(){
        try{
            int num=Integer.parseInt("xyz") ;
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
        }
    }
    public void stringException(){
        try{
            String str="java full stack training";
            System.out.println(str.length());;
            char c = str.charAt(0);
            c = str.charAt(40);
            System.out.println(c);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("StringIndexOutOfBoundsException!!");
        }
    }
    public void nullException(){
        try{
            String str=null;
            System.out.println (str.length());
        }catch(NullPointerException e){
            System.out.println("NullPointerException..");
        }
    }
    public void ownException(int num1,int num2) {
        try {
            if (num1 == 0 || num2 == 0)
                throw new ArithmeticException();
            else
                System.out.println("Both parameters are correct!!");
        } catch (ArithmeticException e) {
            System.out.println("Both parameters are required");
        }
        finally{
            System.out.println("Exception handling is successful");

        }
    }

}
