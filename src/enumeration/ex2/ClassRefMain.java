package enumeration.ex2;

public class ClassRefMain {
    public static void main(String[] args) {
        System.out.println("CLASS BASIC = " + ClassGrade.BASIC.getClass());
        System.out.println("CLASS GOLD = " + ClassGrade.GOLD.getClass());
        System.out.println("CLASS DIAMOND = " + ClassGrade.DIAMOND.getClass());
        System.out.println("-------------------------------------------------------");
        System.out.println("CLASS BASIC = " + ClassGrade.BASIC);
        System.out.println("CLASS GOLD = " + ClassGrade.GOLD);
        System.out.println("CLASS DIAMOND = " + ClassGrade.DIAMOND);
    }
}
