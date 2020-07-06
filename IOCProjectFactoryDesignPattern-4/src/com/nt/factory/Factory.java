package com.nt.factory;


import com.nt.comp.AppoloTyre;
import com.nt.comp.BudgetCar;
import com.nt.comp.CEARTTyre;
import com.nt.comp.Car;
import com.nt.comp.LuxoryCar;
import com.nt.comp.MRFTyre;
import com.nt.comp.SportsCar;
import com.nt.comp.Tyre;

public class Factory {

	//Factory design pattern
	
	public static  Car getCar(String type) {
	   System.out.println("1st Step Factory design pattern call");
		Tyre tyre=null;
		Car car=null;
		
		if(type.equalsIgnoreCase("luxory")) {
			tyre= new CEARTTyre();
            car= new LuxoryCar(tyre);	
		}else if(type.equalsIgnoreCase("Sports")) {
			
			tyre= new MRFTyre();
			car= new SportsCar(tyre);
		}else if(type.equalsIgnoreCase("Budget")) {
			tyre= new AppoloTyre();
			car= new BudgetCar(tyre);
		}else {
			throw new IllegalArgumentException("CarInvaid type");
		}
	
	return car;
	}
	
}
