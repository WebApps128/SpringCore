package com.nt.beans;

import java.util.Date;

public class WishMessageGenerater {
   
	private Date date;
	 
	//setter method for date //seter method Injection
	public void setDate(Date date) {
		this.date=date;
	}
	
	public String generateWishMessage(String user) {
	   int houre=0;
	   
	   //Get current houre of the date
	   houre=date.getHours();
		
	   if(houre<12) {
		
		   return "good Morning Mr."+user;
	   
	   }else if(houre<16) {
		   
		   return "good Afternoon mr."+user;
	   
	   }else if(houre<20){
		   
		   return "good Evening mr."+user;
	   }
	   else {
		   return "good Night mr."+user;
	   }
	}
	
	
}
