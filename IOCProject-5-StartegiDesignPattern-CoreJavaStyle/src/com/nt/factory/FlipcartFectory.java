package com.nt.factory;

import com.nt.comp.BluDart;
import com.nt.comp.Courier;
import com.nt.comp.DTDC;
import com.nt.comp.Flipcart;

public class FlipcartFectory {

	
	
	public static Flipcart getInstance(String courierName) {
		
		Courier courier=null;
	     Flipcart fkt=null;
		//Courier object generation logic
		if(courierName.equalsIgnoreCase("DTDC")) {
			courier= new DTDC();
		
		}else if(courierName.equalsIgnoreCase("BluDart")) {
			courier =new BluDart();
		
		}else {
		   throw new IllegalArgumentException("Courier name invalid please  check once");
		}
		
		//Create target class Object
		fkt= new Flipcart();
		
		//assign dependent class object to target class object
		fkt.setCourier(courier);
		
		
		
		return fkt;
	}
	



}