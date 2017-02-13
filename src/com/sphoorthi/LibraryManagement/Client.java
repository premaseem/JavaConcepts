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
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Book book;
        Student student;
        book = new Book();
        student = new Student();

        String entry = "";
        System.out.println("Enter y or Y to continue or any key to exit to continue");
        entry = scan.next();
        if (!(entry.equals("y")) || (entry.equals("Y"))) {
            System.out.println("Thank you, Bye!");
        }

        while ((entry.equals("y")) || (entry.equals("Y"))) {

            System.out.println("List of Students");
            student.listOfStudents();
            String name = "";

            System.out.println("Choose Student");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    name = "Sphoorthi";
                    student.assignBook(name);
                    student.printAssignedBooks();
                    break;
                case 2:
                    name = "Malathi";
                    student.assignBook(name);
                    student.printAssignedBooks();
                    break;
                case 3:
                    name = "Surender";
                    student.assignBook(name);
                    student.printAssignedBooks();
                    break;
                case 4:
                    name = "Sreenidhi";
                    student.assignBook(name);
                    student.printAssignedBooks();
                    break;
                default:
                    System.out.println("Please select the students from the list");
                    break;

            }
            System.out.println("Enter y or Y to continue or any key to exit to continue");
            entry = scan.next();
            if (!(entry.equals("y")) || (entry.equals("Y"))) {
                System.out.println("Thank you, Bye!");
            }

        }

    }

}
