package com.nt.test;

import com.nt.comp.Flipcart;
import com.nt.factory.FlipcartFactory;

public class StratageDPTest {

	public static void main(String[] args) {
		
		Flipcart fpkt=null;
		
		try {
		fpkt=FlipcartFactory.getInstance();
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Problem on Dependancy Menagement");
		}
		
		System.out.println(fpkt.Shoping(new String[]{"laptope","mobile","TV"}, new float[]{44000,20000,60000}));
		
		
	}//main end
}//calss end
