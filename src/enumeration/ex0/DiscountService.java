package enumeration.ex0;

import enumeration.ex1.StringGrade;

public class DiscountService {
    
    public int discount(String grade, int price) {
        
        int discountPercent = 0;
        if (grade ==  StringGrade.BASIC) {
            discountPercent = 10;
        } else if (grade.equals(StringGrade.GOLD)) {
            discountPercent = 20;
        } else if (grade.equals(StringGrade.DIAMOND)) {
            discountPercent = 30;
        } else {
            System.out.println(grade + ": 할인X");
        }
        return (price * discountPercent) / 100;
    }
}
