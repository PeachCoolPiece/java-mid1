package lang.system;

import java.util.Arrays;
import java.util.Map;
import java.util.Properties;

public class SystemMain {
    public static void main(String[] args) {
        // 현재 시간(밀리초)를 가져온다.
        long currentTimeMillis = System.currentTimeMillis();
        
        System.out.println("currentTimeMillis = " + currentTimeMillis);
        
        // 현재 시간(나노초)를 가져온다.
        long nanoTime = System.nanoTime();
        System.out.println("nanoTime = " + nanoTime);
        
        // 환경 변수를 읽는다.
        Map<String, String> getenv = System.getenv();
        System.out.println("getenv = " + getenv);
        
        //시스템 속성을 읽는다.
        Properties properties = System.getProperties();
        System.out.println("properties = " + properties);
        //java version
        String javaVersion = System.getProperty("java.version");
        System.out.println("javaVersion = " + javaVersion);
        
        // 배열을 고속으로 복사한다.
        char[] a = {'h', 'e', 'l', 'l', 'o'};
        char[] b = new char[5];
        System.arraycopy(a,0,b,0,a.length);
        System.out.println(Arrays.toString(b));
        
        System.exit(0); // 프래그램 종료
        System.out.println("dd");
    }
}
