package pendingTopics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collections {

	public static void main(String[] args) {
		
		/*ArrayList -
		1. Allows Duplicate Values
		2. Allows Null values as well
		3. Follows Insertion Order
		4. used for storing and retrieving data*/
		ArrayList<String> aList = new ArrayList<String>();
		aList.add("a");
		aList.add("b");
		aList.add("a");
		aList.add("c");
		aList.add("a");
		aList.add("d");
		aList.add(null);
		System.out.println("Array List :"+aList);
		
		/*LinkedList
		1. Allows Duplicate Values
		2. Allows Null Values
		3. Follows Insertion Order
		4. used for Manipulate the data*/
		LinkedList<String> llist = new LinkedList<String>();		
		llist.add(null);
		llist.add("a");
		llist.add("b");
		llist.add("c");
		llist.add("a");
		llist.add("b");
		llist.add("c");
		System.out.println("Linked List :"+llist);
		
		/*HashSet
		1. Follows Random order based on Hashing concept of Java
		2. Allows only one null values
		3. will not allow duplicates
		4. Faster when compared to TreeSet and LinkedHashSet*/
		HashSet<String> hSet = new HashSet<String>();
		hSet.add("a");
		hSet.add("b");
		hSet.add("c");
		hSet.add("d");
		hSet.add(null);
		hSet.add("e");
		hSet.add("a");
		hSet.add("b");
		hSet.add("f");
		System.out.println("Hash Set :"+hSet);
		
		/*TreeSet
		1. Follows Natural Order(Asscending Order)
		2. it will not allow null values, if we try to add null values it will throw null pointer exception
		3. will not duplicates
		4. Slower in performance*/
		TreeSet<String> tSet = new TreeSet<String>();
		tSet.add("r");
		tSet.add("b");
		tSet.add("k");
		tSet.add("e");
		tSet.add("u");
		tSet.add("w");
		tSet.add("r");
		tSet.add("w");
		System.out.println("Tree set :"+tSet);
		
		/*LinkedHashSet
		1. follows insertion order
		2. allows one null value
		3. will not allow duplicates
		4. faster than treeset and slower to hashset*/
		LinkedHashSet<String> lhSet = new LinkedHashSet<String>();
		lhSet.add("s");
		lhSet.add("h");
		lhSet.add("e");
		lhSet.add("e");
		lhSet.add("t");
		lhSet.add("h");
		lhSet.add("a");
		lhSet.add("l");
		lhSet.add(null);
		System.out.println("linked hash set :"+lhSet);
		
		/*HashMap
		1. Follows random order of key
		2. will allow one null key and n number of null values
		3. will not allow duplicate keys
		4. faster in all the maps*/
        HashMap<Integer, String> hMap = new HashMap<Integer, String>();
        hMap.put(1, "a");
        hMap.put(3, "v");
        hMap.put(4, "a");
        hMap.put(5, "k");
        hMap.put(1, "d");
        hMap.put(7, "o");
        hMap.put(8, null);
        hMap.put(null, null);
        System.out.println("Hash map :"+hMap);
        
      /*  TreeMap
        1. Follows natural order or keys
        2. will not allow null key, but allows null values
        3. will not allow duplicate keys
        4. slower in performance*/
        TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
        tMap.put(9, "U");
        tMap.put(5, "m");
        tMap.put(8, "a");
        tMap.put(3, "r");
        tMap.put(1, "e");
        tMap.put(1, null);
        tMap.put(12, "R");
        tMap.put(16, "j");
        System.out.println("Tree map :"+tMap);
        
        /*LinkedHashMap
        1. follows insertion order of keys
        2. will allow one null key and n number of null values
        3. will not allow duplicate keys
        4. faster than treemap and slower to hashmap*/
        LinkedHashMap<Integer, String> lhMap = new LinkedHashMap<Integer, String>();
        lhMap.put(75, "q");
        lhMap.put(65, "f");
        lhMap.put(275, null);
        lhMap.put(753, null);
        lhMap.put(null, null);
        lhMap.put(575, "d");
        lhMap.put(755, "b");
        lhMap.put(756, "a");
        System.out.println("Linked hash map :"+lhMap);
        
        /*HashTable
        1. will not allow null keys and null values as well
        2. slow in performace
        3. will not allow duplicate keys*/
        Hashtable<Integer, String> hTab =new Hashtable<Integer, String>();
        hTab.put(1, "g");
        hTab.put(5, "t");
        hTab.put(5, "f");
        hTab.put(8, "o");
        hTab.put(6, "a");
        hTab.put(0, "h");
        hTab.put(3, "hj");
        System.out.println("Hash table :"+hTab);
        
        
        
        
        
        
        
        
        
        
        
        

        
	}

}
