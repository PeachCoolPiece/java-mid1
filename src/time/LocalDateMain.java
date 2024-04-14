package time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateMain {
    public static void main(String[] args) {
        LocalDateTime nowDate = LocalDateTime.now();
        LocalDate ofDate = LocalDate.of(2013, 11, 21);
        System.out.println("오늘 날짜 = " + nowDate);
        System.out.println("지정 날짜 = "  + ofDate);
        
        // 계산 불편
        ofDate = ofDate.plusDays(10);
        System.out.println(ofDate);
    }
}
