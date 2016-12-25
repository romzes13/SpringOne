package com.demo.springone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		// load bean from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		// call methods on the bean
		
		System.out.println(theCoach.getDailyWorkout());
		
		// Let's call our new method for fortunes
		System.out.println(theCoach.getDailyForune());
		
		
		// close the context
		
		context.close();
		
	}

}
