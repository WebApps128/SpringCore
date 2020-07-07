package com.nt.comp;

import java.util.Arrays;
import java.util.Random;


public class Flipcart {

	//Make composition HAS-A Relation 
	private Courier courier;
	

	//Call Setter Injection setter method

	public void setCourier(Courier courier) {
		this.courier = courier;
	}
	
    //Define Shoping method
	public String Shoping(String[] item, float[] price){
	   
		float billAmout=0.0f;
	   int orderId=0;
	   String msg=null;
	   
	   
	   //Calculate Bill amount
	   for(float p:price)
	       billAmout=billAmout+p;
	   
	   //generate rendoum number as orderId
	   orderId=new Random().nextInt(10000);
	   
	   
	   //use courier service for delever the product
	   msg=courier.deliver(orderId);
	   
	   return  Arrays.toString(item)+"has been purches with price of\n"+Arrays.toString(price)+"with bill Amount\n"+billAmout+"-------\n"+msg;
   }

	
	
}
