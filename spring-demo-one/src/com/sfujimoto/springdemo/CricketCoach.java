package com.sfujimoto.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;

	// add new fields for emailaddress and team
    private String emailAddress;
    private String team;


    // for email
    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        System.out.println("CricketCoach: inside setter method - setEmailAdress-");
        this.emailAddress = emailAddress;

    }


    // for team
    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        System.out.println("CricketCoach: inside setter method - setTeam -");
        this.team = team;

    }

    // create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside no-arg constructor");
	}
	// out setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method -setFortuneService-");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
