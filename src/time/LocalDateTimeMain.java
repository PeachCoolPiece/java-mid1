package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime ofDt = LocalDateTime.of(2016, 8, 16, 8, 10, 1);
        
        System.out.println("현재 날짜 시간" + now);
        System.out.println("지정 날짜 시간" + ofDt);
        
        //날짜와 시간 분리
        LocalDate localDate = ofDt.toLocalDate(); // 날짜만 분리
        LocalTime localTime = ofDt.toLocalTime();// 시간만 분리
        System.out.println(localDate);
        System.out.println(localTime);
        
        // 날짜와 시간 합체
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime);
        
        // 계산 불변
        LocalDateTime ofDtPlus = ofDt.plusDays(1000);
        System.out.println("지정 날짜 시간 + 1000일 = "+ ofDtPlus);
        
        LocalDateTime ofDtPlusYear = ofDt.plusYears(1);
        System.out.println("지정 날짜 시간+1년 = " + ofDtPlusYear);
        
        //비교
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + now.isBefore(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + now.isAfter(ofDt));
        System.out.println("현재 날짜 시간이 지정 날짜 시간이 같은가 " + now.isEqual(ofDt));
        
    }
}
