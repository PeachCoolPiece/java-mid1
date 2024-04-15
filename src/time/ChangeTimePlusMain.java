package time;

import java.time.LocalDateTime;

public class ChangeTimePlusMain {
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.of(2018, 1, 1, 13, 30, 59);
        System.out.println("dt = " + dt);
        
        LocalDateTime plusDt = dt.plusYears(10);
        System.out.println("plusDt = " + plusDt);
    }
}
