package com.mohan;

import java.util.ArrayList;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList < Integer > arraylist = new ArrayList < Integer > ();

		arraylist.add(100);
		arraylist.add(5);
		arraylist.add(4);
		arraylist.add(2);
		arraylist.add(7);
		arraylist.add(50);
		arraylist.add(40);
		arraylist.add(12);
		arraylist.add(66);
		arraylist.add(72);
		System.out.println("List of numbers before sorting");
		for (int j: arraylist) {
		System.out.print(" "+j);
		    }
		System.out.println("");
		for (int i = 0; i < arraylist.size(); i++) {

		    for (int j = arraylist.size() - 1; j > i; j--) {
		        if (arraylist.get(i) > arraylist.get(j)) {

		            int tmp = arraylist.get(i);
		            arraylist.set(i,arraylist.get(j));
		            arraylist.set(j,tmp);

		        }

		    }

		}
		System.out.println("List of numbers After sorting");
		for (int i: arraylist) {
		
		    System.out.print(" "+i);
		}

	}

}
