package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach myCoach = context.getBean("myCoach", Coach.class);
		
		
		Coach myAnotherCoach = context.getBean("myCoach", Coach.class);
		
		boolean result = (myCoach == myAnotherCoach);
		
		System.out.println(result);
		
		System.out.println("myCoach = " + myCoach);
		System.out.println("myAnotherCoach = " + myAnotherCoach);
		
		context.close();
		
	}

}
