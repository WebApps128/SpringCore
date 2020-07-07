package com.nt.test;

import com.nt.comp.Flipcart;
import com.nt.factory.FlipcartFectory;

public class StratageDPTest {

	public static void main(String[] args) {
		
		Flipcart fpkt=null;
		fpkt=FlipcartFectory.getInstance("bludart");
		
		System.out.println(fpkt.Shoping(new String[]{"laptope","mobile","TV"}, new float[]{44000,20000,60000}));
		
		
	}
}
