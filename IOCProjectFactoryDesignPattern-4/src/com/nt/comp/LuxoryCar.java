package com.nt.comp;

public class LuxoryCar implements Car {

	

	private Tyre tyre;

	
	public LuxoryCar(Tyre tyre) {
		
		System.out.println("LuxoryCar::0-param Constracture");	
		this.tyre=tyre;

	}

	@Override
	public void drive() {
		System.out.println("2nd step Car class");
		System.out.println("Drive Luxory care having "+tyre.roadGrip());
        
	}

}
