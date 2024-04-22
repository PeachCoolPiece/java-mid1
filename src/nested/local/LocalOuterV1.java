package nested.local;

public class LocalOuterV1 {
    private int outInstanceVar = 3;
    
    public void process(int paramVar) {
        int localVar = 1;
        
        class  LocalPrinter {
            int value = 0;
            
            public void printDate() {
                System.out.println("value = " + this.value);
                System.out.println("value = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("LocalOuterV1.this.outInstanceVar = " + LocalOuterV1.this.outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.printDate();
    }
    
    public static void main(String[] args) {
        LocalOuterV1 localOuter = new LocalOuterV1();
        localOuter.process(2);
    }
}
