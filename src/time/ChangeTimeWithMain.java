package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2024, 4, 1, 13, 30, 59);
        System.out.println("dt = " + dt);
        LocalDateTime ch1 = dt.with(ChronoField.YEAR, 2020);
        System.out.println("ch1 = " + ch1);
        
        LocalDateTime ch2 = dt.withYear(2021);
        System.out.println("ch2 = " + ch2);
        
        // TemplralAdjuster 사용
        // 다음주 금요일
        LocalDateTime with1 = dt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println("dt = " + dt);
        System.out.println("with1 = " + with1);
        
        LocalDateTime with = dt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
        System.out.println("dt = " + dt);
        System.out.println("with = " + with);
        
        
    }
}
