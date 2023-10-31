package collectionsdemo;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of array list class which is implementing methods of list class
//checking add() method
		ArrayList<String> cities =new ArrayList<>();
        cities.add("london");
        cities.add("paris");
        cities.add(2, "uk");
        cities.add("mumbai");
        //size of array list
        System.out.println(cities.size());//print the number of elements in the list
        //print the items
        for(String t: cities) {
        	System.out.println(t);//t is an iterator
        }
	}

}



//hashmap

package collectionsdemo;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapDemo {
	//hash map class map  is implementing interface--> package java.util
	//storing data as key value pair
	//duplicate values are allowed
	//can store any kind of data
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> td=new HashMap<>();
		//using put()to insert key value pair
		td.put(123, "sonal");
		td.put(1234, "sonali");
		td.put(125, "sony");
		//print the values of hash map
		//every key and value inserted in the mapof using type entry
		for(Entry m: td.entrySet()) {
			System.out.println(m.getKey() + " - "+m.getValue());
		}
    System.out.println(td.containsKey(1234));
    System.out.println(td.remove(1234));
	}

}

//HashsetDemo
package collectionsdemo;

import java.util.HashSet;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// A hash set, prints the values in any sequence
				// A hash set does not maintain any index
				// A hash set will not allow duplicate values
		HashSet<String> cities = new HashSet<>();
		
		cities.add("London");
		cities.add("Paris");
		cities.add("New York");
		cities.add("New Delhi");
		cities.add("Moscow");
		cities.add("Mumbai");
		//print the hash set
		//elements will be printed in random sequence
		for(String t :cities) {
			System.out.println(t);
		}
		//print thesize of hashset
		System.out.println(cities.size());
		// Check if an item is in list or not
		
				System.out.println(cities.contains("Hyderabad")); // return false
				
		
		

	}

	private static char[] size() {
		// TODO Auto-generated method stub
		return null;
	}

}

//LinkedLISTdemo
package collectionsdemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList <String> cities=new LinkedList<>();
		
		 cities.add("london");
	     cities.add("paris");
	     cities.add(2, "uk");
	     cities.add("mumbai");
	     
	     System.out.println(cities.size());//size of linkedlist
	     
	     //print the values of the list
	    Iterator itr= cities.iterator();
	    while(itr.hasNext())
	    {
	    	System.out.println(itr.next());
	    }
	    //get a value from the list
	    System.out.println(cities.get(1));
	    //does list contain a value
	    System.out.println(cities.contains("hyderabad"));//returns true or false
	     
	}

}
