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
public class Student {
    
    Map<String, String> students = new HashMap<String, String>();
    Book book = new Book();
    Scanner sc = new Scanner(System.in);

    public Student() {
        students.put("Sphoorthi", "");
        students.put("Surender", "");
        students.put("Malathi", "");
        students.put("Sreenidhi", "");

    }

    public void listOfStudents() {

        Iterator it = students.keySet().iterator();
        int i = 1;
        while (it.hasNext()) {
            System.out.println(i + " " + it.next());
            i++;
        }

    }

    public void assignBook(String name) {
        System.out.println("List of Books");
        book.listOfBooks();
        String bookChoice;
        System.out.println("Choose Book to be assigned to "+name);
        bookChoice = sc.next();
        switch (bookChoice) {
            case "A1":
                students.put(name, "Java");
                break;
            case "A2":
                students.put(name, "Java Script");
                break;
            case "A3":
                students.put(name, "Database");
                break;
            case "A4":
                students.put(name, "J2EE");
                break;
            case "A5":
                students.put(name, "Selenium");
                break;
            case "A6":
                students.put(name, "Let us C");
                break;
            default:
                System.out.println("Please select books from the list");
                break;
        }

    }
    
    public void printAssignedBooks(){
        System.out.println("********Books Assigned********");
                    Iterator it = students.entrySet().iterator();
                    while (it.hasNext()) {
                        System.out.println(it.next());
                    }
    }

}
