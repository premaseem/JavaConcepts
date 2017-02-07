/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Narender Reddy
 */
public class List_Collections {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<studentList> sList = new ArrayList<>();
        sList.add(new studentList(1, "Nari"));
        sList.add(new studentList(2, "Sphoorthi"));
        sList.add(new studentList(3, "Dinesh"));
        System.out.println("An ArrayList with student object");
        Iterator it = sList.iterator();
        while(it.hasNext()){
            studentList s = (studentList)it.next();
            System.out.println("Id :" +s.getId()+" Name: "+s.getName());
        }
        
        /**
         * list is an ArrayList with generic String
         */
        List<String> list = new ArrayList<String>();
        list.add("Nari");
        list.add("Sphoorthi");
        list.add("Dinesh");
        System.out.println("A ArrayList");
        System.out.println(list);
        list.add(1, "Am newely added");
        System.out.println("Newely added element "+list);
        list.set(1, "Am replacing newely added element");
        System.out.println("Replacing "+list);
        
        
        System.out.println();
        LinkedList<String> linkedlist = new LinkedList<String>();
        linkedlist.add("Nari");
        linkedlist.add("Sphoorthi");
        linkedlist.add("Dinesh");
        System.out.println("Am LinkedList");
        linkedlist.size();
        linkedlist.addFirst("First element");
        linkedlist.remove("Dinesh");
        System.out.println(linkedlist);
        System.out.println("printing linkedlist");
        Iterator itr = linkedlist.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
            
        }
        
        
        
    }
    
}
