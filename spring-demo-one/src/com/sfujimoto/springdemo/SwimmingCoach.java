package com.sfujimoto.springdemo;

public class SwimmingCoach implements Coach {

	private FortuneService fortuneService;
	
	

	public SwimmingCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swam in the pool for 3 hours";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "You are a bit lucky today" + fortuneService.getFortune();
	}
	

}
