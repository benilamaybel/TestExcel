//42. Collection a) Write a Java program to create a new array list, add some colors (string) and print out the collection. b) Write a Java program to retrieve an element (at a specified index) from a given array list. c) Write a Java program to iterate through all elements in a array list. d) Write a Java program to remove the third element from a array list. e) Write a Java program to search an element in a array list.

package TestPackage;

import java.util.*;
//import java.util.Iterator;


public class CollectionsFruit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> fruits = new ArrayList<String>();	
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Pomelo");
		fruits.add("Grapes");
		fruits.add("Orange");
		fruits.add("PineApple");
		fruits.add("Jamun");
		fruits.add("Cherry");
		System.out.println("The collection is : "+fruits);
		System.out.println("Printing element at specified index(4) : "+fruits.get(4));
		System.out.println("Iterating through the collection : ");
		Iterator i = fruits.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		fruits.remove(2);
		System.out.println("Collection after removing third element : "+fruits);
		/*
		System.out.println("Search for an element in Arraylist : ");
		Scanner s =  new Scanner (System.in);
		System.out.println("Enter the element to be searched in Arraylist : ");
		String searchvalue = s.next();
		if(fruits.contains(searchvalue)) {
			System.out.println("The fruit is present in ArrayList.");
		}else {
			System.out.println("The fruit is not present in ArrayList.");
		}*/
		System.out.println(fruits.contains("Mango"));
	}

}
