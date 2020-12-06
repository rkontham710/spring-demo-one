package com.luv2code.springdemo;

public class CricketCoach implements Coach {

	private FortuneService fortuneService;
	
	private String emailAddress;
	private String team;
	
	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Running";
	}

	public CricketCoach() {
		
	}
	
	public void setFortuneService(FortuneService myFortuneService) {
		this.fortuneService = myFortuneService;
	}

	@Override
	public String getDailyFortune() {
		
		return "Cricket " + fortuneService.getFortune();
	}

}
