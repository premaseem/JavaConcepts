/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

import java.util.*;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class LinkedListClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(2);
        list.add(6);
        list.add(8);
        list.add(5);
        list.add(1);
        
        System.out.println(list);
        System.out.println("Size: "+list.size());
        list.addFirst(4);
        list.addLast(0);
        System.out.println("After adding: "+list);
        System.out.println("Printing First Element:"+list.getFirst());
        System.out.println("Printing Last Element:"+list.getLast());
        list.removeFirst();
        list.removeLast();
        System.out.println("After Removing: "+list);
        list.add(2);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
        System.out.println(list.contains(3));
        System.out.println(list.isEmpty());
        
        ListIterator<Integer> it = list.listIterator();
        
        while(it.hasNext()){
            
            System.out.print(it.next());
        }
        System.out.println("\n");
        while(it.hasPrevious()){
            
            System.out.print(+it.previous());
        }
        
        
    }
    
}
