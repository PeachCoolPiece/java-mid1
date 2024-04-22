package time.test;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class TestBetween {
    
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2024, 1, 1);
        LocalDate endDate = LocalDate.of(2024, 11, 21);
        
        Period between = Period.between(startDate, endDate);
        System.out.println("between = " + between.getDays());
        
        long years = ChronoUnit.YEARS.between(startDate, endDate);
        long months = ChronoUnit.MONTHS.between(startDate, endDate);
        long days = ChronoUnit.DAYS.between(startDate, endDate);
    
        
    }
}
