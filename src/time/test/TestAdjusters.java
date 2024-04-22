package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestAdjusters {
    public static void main(String[] args) {
        
        int year = 2024;
        int month = 1;
        LocalDate dt = LocalDate.of(year, month, 1);
        DayOfWeek dayOfWeek = dt.getDayOfWeek();
        
        LocalDate with = dt.with(TemporalAdjusters.firstInMonth(dayOfWeek));
        System.out.println("with = " + with);
        
        DayOfWeek dayOfWeek1 = dt.with(TemporalAdjusters.lastDayOfMonth()).getDayOfWeek();
        LocalDate with1 = dt.with(TemporalAdjusters.lastInMonth(dayOfWeek1));
        System.out.println("with1 = " + with1);
    }
}
