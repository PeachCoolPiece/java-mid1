package lang.string.method;

public class StringChangeMain2 {
    public static void main(String[] args) {
        String string = "       Java Programming";
        
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
        
        string.trim();
        string.strip();
        
        string.stripLeading(); // 앞공백 제거
        string.stripTrailing(); // 뒤공백 제거
        
    }
}
