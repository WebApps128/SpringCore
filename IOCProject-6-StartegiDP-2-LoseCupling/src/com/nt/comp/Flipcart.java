package com.nt.comp;

import java.util.Arrays;
import java.util.Random;

public class Flipcart {

	      //make composition HAS-A Relation
	       private Courier courier;
	   
	     //call setter method to inject on setter
        
	       public void setCourier(Courier courier) {
	   		this.courier = courier;
	   	}
	   	        
	
	
	//Shoping method decleard
	public String Shoping(String[] item,float[] price) {
		
		//Decleared variable
		float billAmout=0.0f;
		int oid=0;
		String msg;
		
		//calculate the total bill Amount of item 
		for(float p:price)
		    billAmout=billAmout+p;
		
		//generate order id
		oid=new Random().nextInt(10000);
		
		//use courier service to delivar product
		msg=courier.Delever(oid);
		
	 return"The purcheses Item are "+Arrays.toString(item)+"With Value"
	        +Arrays.toString(price)+"Total amount"+billAmout+"With"
	         +msg;
	}

	
	
	
}
