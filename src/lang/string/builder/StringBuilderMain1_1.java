package lang.string.builder;

public class StringBuilderMain1_1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        sb.append("A");
        sb.append("B");
        sb.append("C");
        sb.append("D");
        System.out.println("sb = " + sb);
        sb.insert(4, "JAVA");
        
        sb.reverse();
        sb.repeat("c", 8);
        
        
    }
}
