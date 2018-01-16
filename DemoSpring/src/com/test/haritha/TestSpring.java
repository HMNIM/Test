package com.test.haritha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
	
	public static void main(String[] args){
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		
		HelloTest ht = ac.getBean("hello", HelloTest.class);
		
		ht.SayHello();
		
	}

}
