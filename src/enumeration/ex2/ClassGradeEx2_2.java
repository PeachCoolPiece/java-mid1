package enumeration.ex2;

public class ClassGradeEx2_2 {
    public static void main(String[] args) {
        int price = 10_000;
        
        DiscountService discountService = new DiscountService();
        ClassGrade classGrade = new ClassGrade();
        int discount = discountService.discount(classGrade, price);
        System.out.println("discount = " + discount);
    }
}
