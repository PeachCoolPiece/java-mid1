package enumeration.ref3;


public enum Grade {
    BASIC(10)
    ,GOLD(20)
    ,DIAMOND(30);
    
    private final int discountPercent;
    
    /**
     * private 이 생략되어있음
     * @param discountPercent
     */
    Grade(int discountPercent) {
        this.discountPercent = discountPercent;
    }
    
    public int getDiscountPercent() {
        return discountPercent;
    }
    
    public int getDiscount(int price) {
        return (price * this.discountPercent) / 100;
    }
}
