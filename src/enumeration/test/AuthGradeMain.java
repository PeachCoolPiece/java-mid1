package enumeration.test;

public class AuthGradeMain {
    public static void main(String[] args) {
        
        AuthGrade[] values = AuthGrade.values();
        for (AuthGrade value : values) {
            printAuthGrade(value);
        }
    }
    
    private static void printAuthGrade(AuthGrade authGrade) {
        System.out.println("grade = " + authGrade.name()  + " " + authGrade.getLevel() + " " + authGrade.getDescription());
        
    }
}
