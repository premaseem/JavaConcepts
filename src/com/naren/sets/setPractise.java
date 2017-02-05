/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naren.sets;

import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Narender Reddy
 */
public class setPractise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Stack st = new Stack();
        st.push("Nari");
        st.push(2);
        st.push("Sphoorthi");
        System.out.println(st);
        System.out.println("poping " +st.pop());
        System.out.println("peek "+st.peek());
        System.out.println("");
        System.out.println("Queue");
        Queue<String> queue = new LinkedList<String>();
        queue.add("Tammudu");
        queue.add("Dinesh");
        queue.add("Java");
        System.out.println(queue);
        System.out.println("priority queue" +queue.remove());
        System.out.println(""+queue.poll());
        
        System.out.println("");
        System.out.println("HashSet");
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        hashSet.add("Dinesh");
        hashSet.add("Nari");
        hashSet.add("Sphoorthi");
        hashSet2 = (HashSet)hashSet.clone();
        System.out.println("Cloned "+hashSet2);
        System.out.println("Removing "+hashSet.remove("Sphoorthi"));
        
        
        
        
        
        
    }
    
}
