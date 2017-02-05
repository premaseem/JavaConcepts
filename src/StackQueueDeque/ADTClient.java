/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackQueueDeque;

import java.util.*;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class ADTClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        Queue queue = new LinkedList();
        Deque dequeue = new LinkedList();
        
        System.out.println("isEmpty: "+stack.isEmpty());
        
        stack.push(3);
        stack.push(6);
        stack.push(7);
        stack.push(2);
        System.out.println("STACK");
        System.out.println(stack);    
        System.out.println("Size: "+stack.size());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Peek: "+stack.peek());
        
        queue.add(1);
        queue.add(12);
        queue.add(13);
        queue.add(14);
        queue.add(15);
        System.out.println("QUEUE");
        System.out.println(queue);
        System.out.println("Size: "+queue.size());
        System.out.println("Remove: "+queue.remove());
        System.out.println("Peek: "+queue.peek());
        
        dequeue.add(1);
        dequeue.add(12);
        dequeue.add(13);
        dequeue.add(14);
        dequeue.add(15);
        System.out.println("DEQUEUE");
        System.out.println(dequeue);
        System.out.println("Size: "+dequeue.size());
        System.out.println("Remove: "+dequeue.remove());
        dequeue.addFirst(5);
        System.out.println("Peek: "+dequeue.peek());
        
        
        
        
        
        
    }
    
}
