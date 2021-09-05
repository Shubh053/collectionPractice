package com.collection.practice;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListPractice {
	public static void main(String[] args) {
		// create ArrayList
		ArrayList<Integer> al = new ArrayList<Integer>();
		
		// add objects in ArrayList
		al.add(123);
		al.add(456);
		al.add(456);
		al.add(645);
		System.out.println(al);
		
		// check if given object is in ArrayList or not
		System.out.println(al.contains(123));
		
		// insert ArrayList into other collection
		LinkedList ll = new LinkedList(al);
		
		// check if collection contain ArrayList or not
		System.out.println(ll.containsAll(al));
		
		// remove object from ArrayList of given index
		al.remove(2);
		System.out.println(al);
		
		// remove all other collection except ArrayLIst
		ll.retainAll(al);
		System.out.println(ll);
		
		// remove ArrayList from collection
		ll.removeAll(al);
		System.out.println(ll);
		
		// remove all objects from ArrayList
		al.clear();
		System.out.println(al);
		
		// get the number of object inside ArrayLIst
		System.out.println(al.size());
		
		// check if ArrayList is empty or not
		System.out.println(al.isEmpty());
		
		al.add(758);
		
		// convert ArrayList into object of array
		Object [] array1 = al.toArray();
		System.out.println(array1[0]);
		
		// create ArrayList with initial capacity
		ArrayList al2 = new ArrayList(200);
		
		// fetch the object by index
		al2.add(0, 1237);
		System.out.println(al2.get(0));
		
		// replace the object by another object from the given index
		al2.set(0, 6789);
		System.out.println(al2.get(0));
		
		// get the index by object
		System.out.println(al2.indexOf(6789));
		System.out.println(al2.lastIndexOf(6789));
	}
}
