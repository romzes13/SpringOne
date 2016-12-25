package com.demo.springone;

public class BaseballCoach implements Coach{
	
	// define a private field for the dependancy
	private FortuneService fortuneService;
	
	
	// define constructor for dependancy injection 
	public BaseballCoach(FortuneService theFortuneService) {

		fortuneService = theFortuneService;
	
	}
	
	
	@Override
	public String getDailyWorkout(){
		return "Baseball practice !";
	}

	@Override
	public String getDailyForune() {

		return fortuneService.getFortune();
	}

}
