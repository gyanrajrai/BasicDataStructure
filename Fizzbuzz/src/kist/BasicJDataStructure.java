package kist;


import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class BasicJDataStructure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//primitive data structure
		byte b=100;
		System.out.println(b);
		int myint=343222;
		System.out.println(myint);
		long mylong=192684718;
		
		System.out.println(mylong);
		 double mydouble=8973598.43;
		 System.out.println(mydouble);
		char mychar='q';
		System.out.println(mychar);
		//String Boject class
		//String is IMMUTABLE in java
		String mystring=new String("test");
		String mystring1="newString";
				
		 System.out.println("firstSrting"+mystring1);
		 System.out.println(mystring.toLowerCase());
		 System.out.println(mystring.toUpperCase());
		 mystring1=mystring1+"addedparam";
		 System.out.println(mystring.toLowerCase());
		 System.out.println("2nd string is"+mystring1);

//Advance data Structure in java
		 //collection
		 //two inportant collection=Arraylist,Hasmap
		 //there are 3 important interface in collection List,map and Set
		 //List is a collection of unordered objects
		 //Map is a collection of(key,value)pair
		 //Set is a collection of ordered objects
		 List <String>mylist=new  ArrayList<String>();
		 
		 mylist.add("sritn1");
		 mylist.add("string2");
		 mylist.add("String 3");
		 System.out.println(mylist);
		 
		 
		 Map<Integer,String>mymap=new HashMap<Integer,String>();
		 mymap.put(1, "coeffee");
		 mymap.put(2, "tea");
		 mymap.put(3, "Milk");
		 System.out.println(mymap.get(3));
		 for(String str:mymap.values()){
		 System.out.println(str+"str is");
		 
		 
		 

	}

}
}