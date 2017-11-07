	package Core_Java_Assignment9_1; // Package declaration is mandatory
	import java.util.*;  
	public class Employee {  
	 
		 public static void main(String args[]){  
		  HashMap<Integer,String> hashMap=new HashMap<Integer,String>();  //HashMap class initialize key as integer and value as Strings
		  hashMap.put(1,"Prabin Kumar");  //put() method associate the specified value with the specified key in this map.
		  hashMap.put(5,"Suchit Rath");  
		  hashMap.put(2,"Vinit Jain"); 
		  hashMap.put(4,"Sudhir Gupta");  
		  hashMap.put(3,"Rohit Yadav"); 
		  for(Map.Entry m:hashMap.entrySet()){ 
			  /* Map.Entry - Enter keys
			  entrySet() - is used to return a collection view of the mappings contained in this map.*/
			  
		   System.out.println(m.getValue()); //It will print the values of keys.
		  }  
		 }  
		} 