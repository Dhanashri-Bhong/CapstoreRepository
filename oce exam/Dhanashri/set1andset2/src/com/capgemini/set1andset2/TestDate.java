package com.capgemini.set1andset2;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestDate {

	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7 , 31 , 1 , 1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE));
		LocalDate date1 = LocalDate.now();
	    LocalDate date2 = LocalDate.of(2020 , 4 , 32);
	    date2.plusDays(10);
		LocalDate date3 = LocalDate.parse("2020-04-19" , DateTimeFormatter.ISO_DATE);
		System.out.println(date1);
    	System.out.println(" date2 = "+date2);
		System.out.println(date3);

	}
	
}
