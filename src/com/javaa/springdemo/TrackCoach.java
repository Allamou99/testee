package com.javaa.springdemo;

public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		return "Just do it : "+this.fortuneService.getFortune();
	}

}
