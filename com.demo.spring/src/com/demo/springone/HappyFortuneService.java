package com.demo.springone;

import java.util.Random;

public class HappyFortuneService implements FortuneService{

	@Override
	public String getFortune() {

		// Declaring a new String array
		String[] myList = {"1st Lucky day!","2nd Lucky day!","3rd Lucky day!"};
		
		// Generating a random number
		Random rand = new Random(); 
		int x = rand.nextInt(myList.length);
		
		System.out.println("Random number is : "+x);
		
		return myList[x];
	}

}
