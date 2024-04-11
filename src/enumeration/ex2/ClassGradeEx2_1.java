package enumeration.ex2;

import enumeration.ex2.DiscountService;

import static enumeration.ex2.ClassGrade.*;

public class ClassGradeEx2_1 {
    public static void main(String[] args) {
        int price = 10_000;
        DiscountService discountService = new DiscountService();
        int basic = discountService.discount(BASIC, price);
        int gold = discountService.discount(GOLD, price);
        int diamond = discountService.discount(DIAMOND, price);
        
        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
