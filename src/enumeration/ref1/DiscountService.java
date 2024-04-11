package enumeration.ref1;


import enumeration.ex1.StringGrade;

public class DiscountService {
    
    public int discount(ClassGrade classGrade, int price) {
        return (price * classGrade.getDiscountPercent()) / 100;
    }
}
