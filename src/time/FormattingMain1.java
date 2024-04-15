package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormattingMain1 {
    
    private final static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    
    public static void main(String[] args) {
        // 포맷팅 : 날짜를 문자로
        
        LocalDate date = LocalDate.of(2024, 12, 31);
        System.out.println("date = " + date);
        String formatted = date.format(dateTimeFormatter);
        System.out.println("formatted = " + formatted);
        
        
        // 문자를 날짜로
        
        String input = "2030-01-01";
        LocalDate parse = LocalDate.parse(input,dateTimeFormatter);
        System.out.println("parse = " + parse);
    }
}
