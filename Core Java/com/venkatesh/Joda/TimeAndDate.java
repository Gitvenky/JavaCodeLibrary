package com.venkatesh.Joda;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeAndDate {

	public static void main(String[] args) {
		
		LocalTime time= LocalTime.now();
		LocalDate date= LocalDate.now();
		System.out.printf("Current time is :"+"%d-%s-%d::%d-%d-%d",date.getDayOfMonth(),date.getMonth(),date.getYear()
				,time.getHour(),time.getMinute(),time.getSecond());
		System.out.println();
		
		
		LocalDate birthDay= LocalDate.of(1993,9,01);
		LocalDate today=LocalDate.now();
		LocalDateTime dateTime= LocalDateTime.now();
		LocalDateTime dateTime1 = LocalDateTime.of(date, time);
		Period age= Period.between(birthDay,today);
		System.out.printf("Your age as of today is %d years,%d months, %d days :" , age.getYears(),age.getMonths(),age.getDays());
		
		ZoneId laZone= ZoneId.of("America/Los_Angeles");
		ZonedDateTime timeInLA= ZonedDateTime.now(laZone);
		System.out.println("\n"+timeInLA);
		

	}
}
