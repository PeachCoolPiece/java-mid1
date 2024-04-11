package lang.string.chainning;

public class MethodChainingMain1 {
    public static void main(String[] args) {
        ValueAdder adder = new ValueAdder();
        adder.add(1).add(2).add(3);
        
        int value = adder.getValue();
        
        System.out.println("value = " + value);
        
    }
}
