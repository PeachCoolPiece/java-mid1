package enumeration.ex3;

import java.util.Arrays;

public class EnumMethodMain {
    public static void main(String[] args) {
        //모든 ENUM반환
        Grade[] values = Grade.values();
        System.out.println("values = " + Arrays.toString(values));
        
        for (Grade value : values) {
            System.out.println("value.name()  = " + value.name());
            System.out.println("value.ordinal() = " + value.ordinal());
        }
        
        //String -> Enum 변환
        
        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold = " + gold); // toString() 오버라이딩 가능
    }
}
