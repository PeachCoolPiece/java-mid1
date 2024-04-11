package lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class helloClass = Hello.class;
        Class helloClass1 = Class.forName("lang.clazz.Hello");
        
        Hello hello = (Hello)helloClass1.getDeclaredConstructor().newInstance();
        String hello1 = hello.hello();
        System.out.println("hello1 = " + hello1);
        
    }
}
