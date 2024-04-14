package enumeration.ref3;


import static enumeration.ref3.Grade.*;

public class EnumRefMain3_2 {
    public static void main(String[] args) {
        int price = 10_000;
        DiscountService discountService = new DiscountService();
        
        int basic = BASIC.getDiscount(price);
        int gold = GOLD.getDiscount(price);
        int diamond = DIAMOND.getDiscount(price);
        
        
        System.out.println("basic = " + basic);
        System.out.println("gold = " + gold);
        System.out.println("diamond = " + diamond);
    }
}
