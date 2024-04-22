package nested.local;

public class LocalOuterV2 {
    private int outInstanceVar = 3;
    
    public void process(int paramVar) {
        int localVar = 1;
        
        class  LocalPrinter implements Printer{
            int value = 0;
            
            @Override
            public void print() {
                System.out.println("value = " + this.value);
                System.out.println("value = " + localVar);
                System.out.println("paramVar = " + paramVar);
                System.out.println("LocalOuterV1.this.outInstanceVar = " + LocalOuterV2.this.outInstanceVar);
            }
        }
        LocalPrinter printer = new LocalPrinter();
        printer.print();
    }
    
    public static void main(String[] args) {
        LocalOuterV2 localOuter = new LocalOuterV2();
        localOuter.process(2);
    }
}
