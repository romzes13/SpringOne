package com.demo.springone;

public class cricketCoach implements Coach{

	private FortuneService fortuneService;
	
	
	// create a no arg constructor
	
	public cricketCoach() {

		System.out.println("Inside of constructor Cricket: ");
	}
	
	
	// Setter method to set the dependencie
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside of setter method Cricket: ");

		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {

		return "Practice bowling for 15 minutes!";
	}

	@Override
	public String getDailyForune() {
		
		return fortuneService.getFortune();
	}
	
	
	
	

}
