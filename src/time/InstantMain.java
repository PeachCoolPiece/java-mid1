package time;

import java.time.Instant;
import java.time.ZonedDateTime;

public class InstantMain {
    public static void main(String[] args) {
        // 생성
        Instant now = Instant.now(); // UTC 기준
        System.out.println("now = " + now);
        
        ZonedDateTime now1 = ZonedDateTime.now();
        Instant from = Instant.from(now1);
        System.out.println("from = " + from);
        
        Instant instant = Instant.ofEpochSecond(0);
        System.out.println("instant = " + instant);
        Instant later = instant.plusSeconds(3600);
        System.out.println("later = " + later);
    }
}
