package com.nt.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.WishMessageGenerater;

public class SetterInjectionTest {

	public static void main(String[] args) {
		
       Resource  res=null;
       BeanFactory factory=null;
       Object obj=null;
       String result=null;
       WishMessageGenerater generater=null;
       
     //hold name location of spring been cfg file
     res= new FileSystemResource("src/com/nt/cfg/applicationContext.xml");
		 
    //create bean factory resource for IOC contener
    factory= new XmlBeanFactory(res);				
     		
  //get Target  bean class Object
	
  		obj=factory.getBean("wmg");
  		
  		//type casting
  		generater=(WishMessageGenerater)obj;
  		
  		//invoke the method
  		result=generater.generateWishMessage("binayaka");
  		System.out.println("message=="+result);
  		
     		
		  
	}//main
}//class
