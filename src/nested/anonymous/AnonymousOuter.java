package nested.anonymous;

import nested.local.Printer;

public class AnonymousOuter {
    private int outInstanceVar = 3;
    
    public static void main(String[] args) {
        AnonymousOuter localOuter = new AnonymousOuter();
        localOuter.process(2);
    }
    
    public void process(int paramVar) {
        int localVar = 1;
        
        // 익명클래스
        Printer printer = new Printer() {
            int value = 0;
            // Printer 인터페이스 구현  - body
            @Override
            public void print() {
                System.out.println("value = " + this.value);
                System.out.println("value = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("LocalOuterV1.this.outInstanceVar = " + AnonymousOuter.this.outInstanceVar);
            }
        };
        printer.print();
    }
}
