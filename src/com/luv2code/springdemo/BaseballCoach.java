package com.luv2code.springdemo;

public class BaseballCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
