package com.nt.factory;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import com.nt.comp.Courier;
import com.nt.comp.Flipcart;

public class FlipcartFactory {

	
   //HAS-A Relation 
	private static Properties prop;
	
	static {
		
		try {
			//locate the property file
			InputStream is = new FileInputStream("src/com/nt/commons/info.properties");
            
			prop= new Properties();
			
			prop.load(is);
				
		      }catch(Exception e) {
			        e.printStackTrace();
		}
		
	}//end of Static block
	
	public static Flipcart getInstance() throws Exception{
		
		Courier courier=null;
		Flipcart fpkt=null;
		
		courier=(Courier)Class.forName(prop.getProperty("sdp.dependant")).newInstance();
		
		//crate target class object
		fpkt = new Flipcart();
		
		//assig target calss object to dependent class
		fpkt.setCourier(courier);
		
		return fpkt;
	}
	
	
	
	
	
	
}//end of FlipcartFactory
