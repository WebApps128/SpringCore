package com.nt.test;

import com.nt.comp.Car;
import com.nt.factory.Factory;

public class Test {

    public static void main(String[] args) {
		
    	Car car=null;
    	
    	car=Factory.getCar("luxory");
    	car.drive();
    	System.out.println("====================================");
    	car=Factory.getCar("Sports");
    	car.drive();
    	System.out.println("====================================");
    	car=Factory.getCar("Budget");
    	car.drive();
    	System.out.println("====================================");
    	
    	
	}	

}
