package time.test;

import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class TestLoopPlus {
    public static void main(String[] args) {
        LocalDate dt = LocalDate.of(2024, 1, 1);
        System.out.println("dt = " + dt);
        for (int i = 1; i <5 ; i++) {
            LocalDate localDate = dt.plusDays(14 * i);
            System.out.println("localDate = " + localDate);
        }
    }
}
