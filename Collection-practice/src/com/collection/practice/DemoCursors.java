package com.collection.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class DemoCursors {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		
		for(int i = 1; i <= 10; i++)
		{
			al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext())
		{
			Object obj = itr.next();
			Integer i = (Integer)obj;
			if(i % 2 == 0)
			{
				System.out.println(i);
				itr.remove();
			}
		}
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add("hi");
		al2.add("bye");
		al2.add("hello");
		al2.add("go");
		System.out.println(al2);
		ListIterator lit = al2.listIterator();
		while(lit.hasNext())
		{
			Object obj = lit.next();
			String s = (String)obj;
			if(s.equals("hi"))
			{
				lit.set("Jai");
			} else if(s.equals("hello")) {
				lit.add("Ram");
			} else if(s.equals("go")) {
				lit.remove();
			}
		}
		System.out.println(al2);
	}
}
