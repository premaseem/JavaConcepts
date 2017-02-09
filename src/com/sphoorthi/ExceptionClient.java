/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exceptions;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class ExceptionClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer num = null;
        int balance = 0;
        int x = 1;
        try{
            System.out.println("Writes to a file");
            num=50/balance;
            try{
                num.toString();
            }
            
            catch(NullPointerException e){
                System.out.println(e);
                num = 1;
                System.out.println(x);
                System.out.println("Default value is given");
            }

        }
        
        catch(ArithmeticException e){
            System.out.println(e);
            num = 1;
        }
        
        finally {
            System.out.println("Finally block runs always whether exception is raised or not. ");
            System.out.println("close the file ");
        }

        System.out.println("remaining numbers are"+num);
    }
    
}
