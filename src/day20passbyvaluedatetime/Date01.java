package day20passbyvaluedatetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Date01 {
	
	/*
	 * WE can create object in 2 ways;
	 * 1) By using "new" keyword.For example; " int arr[] = new int [3];"
	 * 2) We convert an existing object to another object "List<Integer> list= Arrays.asList(12,13,14);"
	 */

	public static void main(String[] args) {
		
		System.out.println(LocalDate.now());//2021-10-29
		
		System.out.println(LocalTime.now());//08:46:46.062951800
		
		System.out.println(LocalDateTime.now());//2021-10-29T08:47:55.146488700
		
		//How to manipulate date
		
		LocalDate currentDate= LocalDate.now();
		
		System.out.println("Before adding 7 days: " +currentDate);// 2021-10-29
		
		currentDate = currentDate.plusDays(7);
		
		System.out.println("After adding 7 days: " +currentDate);//2021-11-05
		
		currentDate= currentDate.minusDays(2);
		System.out.println("After adding 7 days: " +currentDate);//2021-11-03
		
		
		currentDate=currentDate.plusMonths(5);
		System.out.println("After adding 5 months: " +currentDate);//2022-04-03
		
		
		currentDate= currentDate.minusYears(6).plusMonths(4).minusDays(5);
		System.out.println("Method chain: " + currentDate);//2016-07-29
		
		//How to manipulate time
		
		LocalTime currentTime= LocalTime.now();
		
		int hour= currentTime.getHour();
		System.out.println(hour);//9
		
		boolean isAfter= currentTime.isAfter(LocalTime.of(8, 11, 32,1234));
		System.out.println(isAfter);//true since it is before 9
		
		System.out.println(currentTime.NOON);//12:00pm
		
	
		System.out.println(currentTime.getHour());
		
		System.out.println(currentTime.minusHours(3));
		System.out.println(currentTime);
		
		LocalTime time = LocalTime.now();
		
//		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm");
//
//		System.out.println(dtf.format(time));
//		System.out.println(time.plusMinutes(11));
//		
		//DateTimeFormatter dtf = DateTimeFormatter.ofPattern("hh:mm");

		//System.out.println(dtf.format(time));
		
		System.out.println(time.minusHours(2));
		
		

	}

}
