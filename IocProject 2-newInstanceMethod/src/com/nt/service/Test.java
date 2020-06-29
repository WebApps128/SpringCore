package com.nt.service;

public class Test {

     private int x;
     private int y;

     
	
	
	
   static {
	   System.out.println("----Class loaded----");
    }

   
   public Test() {
         System.out.println("0--Param Constractor");
    }
   
   public Test(int a,int b) {
	   System.out.println("2-Param Cnstractore");
  
	    this.x=a;
	    this.y=b;
   
   
   }
   
   
   
   @Override
public String toString() {
	return "Test[]";
}
   
 

}
