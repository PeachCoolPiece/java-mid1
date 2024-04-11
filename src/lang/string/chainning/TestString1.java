package lang.string.chainning;

import java.lang.reflect.Array;
import java.util.Arrays;

public class TestString1 {
    public static void main(String[] args) {
        String url = "https://www.example.com";
        
        boolean b = url.startsWith("https://");
        System.out.println("b = " + b);
        
        String[] arr =  {"hello","java","jvm","spring","jpa"};
        for (String string : arr) {
            System.out.println(String.format("%s:%d",string,string.length()));
        }
        int sum = Arrays.stream(arr).mapToInt(String::length).sum();
        System.out.println("sum = " + sum);
        
        String str = "hello.txt";
        
        int index = str.indexOf(".txt");
        String hello = str.substring(0,index);
        String txt = str.substring(index);
        System.out.println("hello " + hello);
        System.out.println("txt " + txt);
        
        String original = "       Hello Java";
        String trim = original.trim();
        System.out.println("trim = " + trim);
        
        String fruits = "apple,banana,mango";
        String[] split = fruits.split(",");
        for (String string : split) {
            System.out.println(string);
        }
        System.out.println("joinedString = " + String.join("->", split));
        
        String string = "Hello Java";
        String string1 = String.valueOf(new StringBuilder(string).reverse());
        System.out.println("string1 = " + string1);
    }
}
