package java8;

import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {
	
	public static void main(String[] args) {
		
		LocalDate bdate = LocalDate.of(1997, 12, 24);
		
		LocalDate cdate = LocalDate.now();
		
		Period p = Period.between(bdate, cdate);
		
		System.out.printf("Your age is :- %d years ,%d months, %d days",p.getYears(),p.getMonths(),p.getDays());
		
		
	}

}
