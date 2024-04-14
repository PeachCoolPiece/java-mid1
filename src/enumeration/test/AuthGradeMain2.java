package enumeration.test;

import java.util.Scanner;

public class AuthGradeMain2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("당신의 등급을 입력하세요[GUEST , LOGIN , ADMIN]: ");
        String line = scanner.next();
        
        AuthGrade authGrade = AuthGrade.valueOf(line.toUpperCase());
        authGrade.inputGrade();
        
    }
}
