package enumeration.ex3;

public class EnumRefMain {
    public static void main(String[] args) {
        System.out.println("BASIC = " + Grade.BASIC.getClass());
        System.out.println("GOLD = " + Grade.GOLD.getClass());
        System.out.println("DIAMOND = " + Grade.DIAMOND.getClass());
        
        System.out.println("Grade.BASIC = " + refValue(Grade.BASIC));
        System.out.println("Grade.GOLD = " + refValue(Grade.GOLD));
        System.out.println("Grade.DIAMOND = " + refValue(Grade.DIAMOND));
    }
    
    private static String refValue(Object grade) {
        return Integer.toHexString(System.identityHashCode(grade));
    }
}
