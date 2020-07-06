package com.nt.comp;

public class SportsCar implements Car {

	 private Tyre tyre;
	 
	 public SportsCar(Tyre tyre) {
	  
		 System.out.println("SportsCar::0-Param Constracture Created");
		 this.tyre=tyre;	  
	}
		
	
	@Override
	public void drive() {
	System.out.println("Drive Sports car having"+tyre.roadGrip());
    
	}

}
