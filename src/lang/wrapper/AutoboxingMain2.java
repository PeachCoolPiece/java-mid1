package lang.wrapper;

public class AutoboxingMain2 {
    public static void main(String[] args) {
        // Pirimitive -> Wrapper
        int value = 7;
        Integer boxedValue = value; // 오토박싱
        
        // Wrapper -> Primitive
        int unboxedValue = boxedValue; // 오토 언박싱
        
    }
}
