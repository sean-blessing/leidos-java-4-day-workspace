package com.lab8.ui;

import java.util.Date;

import com.lab8.business.AlarmClock;
import com.lab8.business.Timepiece;

public class TimeKeeperApp {

	public static void main(String[] args) {
		System.out.println("Welcome to the TimeKeeperApp");

		AlarmClock myClock = new AlarmClock(new Date());
		myClock.getCurrentTime();
		//System.out.println(myClock.currentTime);  ==> currentTime not accessible
		
		// example of polymorphism
		Timepiece anotherClock = new AlarmClock(new Date());
		anotherClock.getCurrentTime();
		
		//AlarmClock badClock = new Timepiece();  ==> won't work
		
		
		System.out.println("Bye");
	}

}
