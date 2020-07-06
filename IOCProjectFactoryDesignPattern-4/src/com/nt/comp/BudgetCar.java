package com.nt.comp;

public class BudgetCar implements Car {

	private Tyre tyre;
	
	public BudgetCar(Tyre tyre) {
	System.out.println("BudgetCar::0-param constracture");
	this.tyre=tyre;
	}
	
	
	@Override
	public void drive() {
		System.out.println("BudgetCar runninng over"+tyre.roadGrip());
    
	}

}
