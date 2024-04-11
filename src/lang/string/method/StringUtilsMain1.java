package lang.string.method;

public class StringUtilsMain1 {
    
    public static void main(String[] args) {
        int num = 100;
        boolean bool = true;
        Object obj = new Object();
        String str = "Hello, Java!";
        
        // valueOf 메서드
        
        String numString = String.valueOf(num);
        System.out.println(numString);
        System.out.println(String.valueOf(bool));
        System.out.println(String.valueOf(obj));
        
        
        // 문자 + x -> 문자
        String string = "" + num;
        
        //toCharArray 메서드
        
        char[] charArray = str.toCharArray();
        for (char c : charArray) {
            System.out.print(c);
        }
    }
}
