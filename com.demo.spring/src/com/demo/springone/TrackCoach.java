package com.demo.springone;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;
	
	public TrackCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a 5K !";
	}

	@Override
	public String getDailyForune() {

		return "Just do it!" + fortuneService.getFortune();
	}

}
