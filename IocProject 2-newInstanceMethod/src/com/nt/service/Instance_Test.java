package com.nt.service;

import java.lang.reflect.Constructor;

public class Instance_Test {

	public static void main(String[] args) {
	
		Class c1=null,c2=null;
		Object obj=null,obj2=null;
        Constructor con[]=null;
		
		
	try {	
		c1 =Class.forName(args[0]);
	    
		 System.out.println("sampad ");
		obj=c1.newInstance();
		
		System.out.println("----------------Date Class Object---------------------------");
	
		c2=Class.forName(args[1]);
		
		obj2=c2.newInstance();
	     System.out.println(obj2);	
	
	     System.out.println("-------------Parametarise Costracter-------------");
	     
	     //c3=Class.forName(args[2]);
	     
	    // obj3=c3.
	     
	     
	}catch(InstantiationException ie) {
		ie.printStackTrace();
	}catch(ClassNotFoundException cne) {
		cne.printStackTrace();
	}catch(Exception e) {
	   e.printStackTrace();
	}
		
	}//end of main method
	
	
}//end of class
