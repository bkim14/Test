package com.scsa.java.util;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.scsa.java.car4.Car;

public class ListTest {

	public static void main(String[] args) {
		/*List s=new ArrayList();
		s.add("seoul");
		s.add("busan");
		s.add("incheon");
		//s.add(new Integer(30));
		s.add(30);
		s.add(new Car("1145311",500,"aa"));
		s.add(new Car("1145311",500,"aa"));

		for( Object ob :s) {
			System.out.println(ob);
		}*/
		
		
		List<String> s=new <String>ArrayList();
		s.add("seoul");
		s.add("busan");
		s.add("incheon");
		s.add("30");
		s.add(new Car("1145311",500,"aa").toString());
		s.add(new Car("1145311",500,"aa").toString());
		
		/*Iterator<String> si=s.iterator();
		while(si.hasNext()) {
			System.out.println(si.next());
		}*/
		for( String ob :s) {
			System.out.println(ob);
		}
		System.out.println(s);
		System.out.println(s.get(1));
		s.remove(1);
		System.out.println(s.get(1));
		 
	}

}