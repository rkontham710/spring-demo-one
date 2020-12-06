package com.luv2code.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {

	String data[] = {
			"Random Fortune Service 1",
			"Random Fortune Service 2",
			"Random Fortune Service 3"
	};
	
	private Random random = new Random();
	
	
	@Override
	public String getFortune() {
		
		return data[random.nextInt(data.length)];
	}

}
