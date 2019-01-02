/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LibraryManagement;

import java.util.*;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class Book {
    Set<String> books = new HashSet<String>();

    public Book() {
      books.add("Java Script");
      books.add("Java");
      books.add("J2EE");
      books.add("Let us C");
      books.add("Selenium");
      books.add("Database");      
    }
    
    public void listOfBooks(){
        Iterator it = books.iterator();
        int i = 1;
        while(it.hasNext()){
            System.out.println("A"+i+" "+it.next());
            i++;
        }       
        
    }

    
    
    
    
    
}
