package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.of(2030, 1, 1, 13, 30, 59);
        
        int year = dt.get(ChronoField.YEAR);
        System.out.println("year = " + year);
        int month = dt.get(ChronoField.MONTH_OF_YEAR);
        System.out.println("month = " + month);
        int day = dt.get(ChronoField.DAY_OF_MONTH);
        System.out.println("day = " + day);
        int hour = dt.getHour();
        int minute = dt.getMinute();
        int second = dt.getSecond();
        System.out.println("hour = " + hour);
        System.out.println("minute = " + minute);
        System.out.println("second = " + second);
        
        
    }
}
