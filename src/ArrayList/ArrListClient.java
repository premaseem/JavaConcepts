/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.util.*;

/**
 *
 * @author Sphoorthi Gaddam
 */
public class ArrListClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Student s1 = new Student(12, "Sphoorthi", 24);
        Student s2 = new Student(23, "Narender", 22);
        Student s3 = new Student(45, "Surender", 46);
        Student s4 = new Student(22, "Malathi", 30);

        ArrayList<String> list = new ArrayList<String>();
        ArrayList<Student> objlist = new ArrayList<Student>();
        List<Integer> intlist = new ArrayList<Integer>();

        objlist.add(s1);
        objlist.add(s4);
        objlist.add(s3);
        objlist.add(s2);

        list.add("Sphoorthi");
        list.add("Surender");
        list.add("Malathi");
        list.add("Sreenidhi");
        list.add("Lalitha");
        
        intlist.addAll(Arrays.asList(1,3,6,5,2));
        
        System.out.println(list);
        System.out.println("\nIterating using Iterator class");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        
        System.out.println("\n\nIterating using for-each loop");
        for(int i:intlist){
            System.out.print(i+" ");
        }

        System.out.println("\n\nPritnting Student Object");
//        for(Student s:objlist){
//            System.out.println("Id: "+s.id+" Name: "+s.name+" Age: "+s.age);
//        }
//        
        Iterator itr = objlist.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();
            System.out.println("Id: " + st.id + " Name: " + st.name + " Age: " + st.age);
        }
        
        

    }

}
