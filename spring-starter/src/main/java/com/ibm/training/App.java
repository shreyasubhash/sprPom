package com.ibm.training;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
public class App 
{
    public static void main( String[] args )
    {
        
//    	Engineer theEngineer = new Engineer();
//    	
//    	theEngineer.work();
    	
    	
//    	Or the Spring way:
    	
//    	Load the Application Context
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContextAnnotations.xml");
    	
//    	Get a reference to the object
    	Engineer eng = context.getBean("aE", Engineer.class);
    	
//    	Get another reference to the object
//    	Engineer secEng = context.getBean("cE", Engineer.class);
    	
//    	System.out.println(eng == secEng);
//    	System.out.println(eng +"\n" + secEng);
    	
//    	Call the method
    	system.out.println("hello");	
    	
    }
    
   
    
    
    
    
    
}
