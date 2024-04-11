package lang.string.method;

public class StringChangeMain1 {
    public static void main(String[] args) {
        String str = "Hello, Java! Welcome to Java";
        System.out.println(str.substring(str.indexOf("Java"),str.indexOf("!")));
        
        String concat = str.concat("!!!!");
        System.out.println(concat);
        String replace = str.replace("Java", "World");
        System.out.println(replace);
        String string = str.replaceFirst("Java", "World");
        
        
    }
}
