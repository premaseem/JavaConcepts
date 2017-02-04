package com.premaseem.collection;

/**
 * Created by asee2278 on 2/4/17.
 */


// we have category
// 101 - java
// 102 - javascript
//103 - golang

import java.util.*;
class Book {

    int id,quantity,category;
    String name,author;

    public Book(int id, String name, String author, Integer category, int quantity) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.author = author;
        this.quantity = quantity;
    }

    @Override
    public int hashCode(){
        return category;
    };

}
public class Hasing {
    public static void main(String[] args) {
        //Creating map of Books
        Map<Integer,Book> map=new Hashtable<Integer,Book>();
        List<Book> listJava = new ArrayList<Book>();
        List<Book> listJavaScrip = new ArrayList<Book>();
        List<Book> listgo = new ArrayList<Book>();

        Map<Integer,List<Book>> simulatedHashMap = new HashMap<Integer,List<Book>>();




        //Creating Books
        Book b1=new Book(101,"Let us Java","Yashwant Kanetkar",101,8);
        Book b5=new Book(101,"Bile of java","Yashwant Kanetkar",101,8);
        Book b8=new Book(101,"From 0 to Hero in Java","Yashwant Kanetkar",101,8);
        listJava.add(b1);
        listJava.add(b5);
        listJava.add(b8);


        Book b3=new Book(101,"Let us Javascript","Yashwant Kanetkar",102,8);
        Book b6=new Book(101,"Bile of javascript","Yashwant Kanetkar",102,8);
        listJavaScrip.add(b3);
        listJavaScrip.add(b6);
        listJavaScrip.add(new Book(420,"Allocate Javascript","Naren",102,12));


        Book b2=new Book(101,"Let us Go","Yashwant Kanetkar",103,8);
        Book b4=new Book(101,"Bile of Golang","Yashwant Kanetkar",103,8);
        Book b7=new Book(101,"From 0 to Hero in javascript","Yashwant Kanetkar",102,8);
        listgo.add(b2);
        listgo.add(b4);
        listgo.add(b7);

        //Adding Books to map
//        map.put(1,b1);
//        map.put(2,b2);
//        map.put(3,b3);
//        //Traversing map
//        for(Map.Entry<Integer, Book> entry:map.entrySet()){
//            int key=entry.getKey();
//            Book b=entry.getValue();
//            System.out.println(key+" Details:");
//            System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
//        }

        simulatedHashMap.put(101,listJava);
        simulatedHashMap.put(102,listJavaScrip);
        simulatedHashMap.put(103,listgo);

        List<Book> returnList= simulatedHashMap.get(101);
        for( Book b : returnList){
            System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
        }

        returnList= simulatedHashMap.get(102);
        System.out.println();
        for( Book b : returnList){

            System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
        }

        returnList= simulatedHashMap.get(103);
        System.out.print("\n");
        for( Book b : returnList){
            System.out.println(b.id+" "+b.name+" "+b.author+"  "+b.quantity + " " + b.hashCode());
        }

    }
}