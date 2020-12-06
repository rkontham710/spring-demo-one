package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GolfPractiseApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Coach myCoach = context.getBean("myGolfCoach", Coach.class);
		
		
		System.out.println(myCoach.getDailyFortune());
		
		context.close();
	}

}
