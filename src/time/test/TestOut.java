package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestOut {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("년도를 입력하세요 : ");
        int yearInput = Integer.parseInt(sc.next());
        System.out.print("월을 입력하세요 : ");
        int monthInput = Integer.parseInt(sc.next());
        
        
        printCalender(yearInput, monthInput);
        
    }
    
    private static void printCalender(int yearInput, int monthInput) {
        LocalDate firstDayOfMonth = LocalDate.of(yearInput, monthInput, 1);
        LocalDate firstDayOfNextMonth = firstDayOfMonth.plusMonths(1);
        
        // 월요일 = 1(1%7=1) ... 일요일 = 7(7%7=0)
        int offsetWeekDays = firstDayOfMonth.getDayOfWeek().getValue() % 7;
        
        System.out.print("Su Mo Tu We Th Fr Sa ");
        for (int i = 0; i <offsetWeekDays ; i++) {
            System.out.println("   ");
        }
        LocalDate dayIterator =  firstDayOfMonth;
        
        
        while (dayIterator.isBefore(firstDayOfNextMonth)){
            System.out.printf("%2d ",dayIterator.getDayOfMonth());
            if (dayIterator.getDayOfWeek() == DayOfWeek.SATURDAY) {
                System.out.println();
            }
            dayIterator =  dayIterator.plusDays(1);
        }
    }
}
