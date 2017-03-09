package com.sfujimoto.springdemo;

public class MyApp {

	public static void main(String[] args) {
		
		//create object
		Coach theCoach = new TrackCoach(null);
		
		//use the object
		System.out.println(theCoach.getDailyWorkout());
	}

}
